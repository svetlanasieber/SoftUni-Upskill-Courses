import java.util.*;

public class P01_Ranking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestsInfo = new LinkedHashMap<>();
        Map<String, List<String>> contestantsInfo = new TreeMap<>();
        Map<String, Integer> contestantsPoints = new TreeMap<>();

        String[] contestData = scanner.nextLine().split(":");
        while (!contestData[0].equals("end of contests")) {
            String contest = contestData[0];
            String password = contestData[1];
            contestsInfo.put(contest, password);
            contestData = scanner.nextLine().split(":");
        }

        String[] data = scanner.nextLine().split("=>");
        while (!data[0].equals("end of submissions")) {
            String contest = data[0];
            String password = data[1];
            
            if (contestsInfo.containsKey(contest) && contestsInfo.get(contest).equals(password)) {
                String contestant = data[2];
                String points = data[3];
                
                if (!contestantsInfo.containsKey(contestant)) {
                    contestantsInfo.put(contestant, new ArrayList<>());
                    contestantsInfo.get(contestant).add(contest);
                    contestantsInfo.get(contestant).add(points);
                } else {
                    if (contestantsInfo.get(contestant).contains(contest)) {
                        int indexOfPoints = contestantsInfo.get(contestant).indexOf(contest) + 1;
                        int currentPoints = Integer.parseInt(contestantsInfo.get(contestant).get(indexOfPoints));
                        int greaterPoints = Math.max(Integer.parseInt(points), currentPoints);
                        contestantsInfo.get(contestant).set(indexOfPoints, String.valueOf(greaterPoints));
                    } else {
                        contestantsInfo.get(contestant).add(contest);
                        contestantsInfo.get(contestant).add(points);
                    }
                }
            }
            data = scanner.nextLine().split("=>");
        }
        
        for (Map.Entry<String, List<String>> entry : contestantsInfo.entrySet()) {
            int contestantPoints = 0;
            
            for (int i = 1; i < entry.getValue().size(); i += 2) {
                contestantPoints += Integer.parseInt(entry.getValue().get(i));
            }
            contestantsPoints.put(entry.getKey(), contestantPoints);
        }
        
        String topContestant = "";
        int pointsOfTheTopContestant = -1;
        for (Map.Entry<String, Integer> entry : contestantsPoints.entrySet()) {
            if (entry.getValue() > pointsOfTheTopContestant) {
                topContestant = entry.getKey();
                pointsOfTheTopContestant = entry.getValue();
            }
        }
        
        System.out.printf("Best candidate is %s with total %d points.%n", topContestant, pointsOfTheTopContestant);
        System.out.println("Ranking:");
        for (Map.Entry<String, List<String>> entry : contestantsInfo.entrySet()) {
            System.out.println(entry.getKey());
            Map<Integer, String> contestsSortMap = new TreeMap<>(Collections.reverseOrder());
            for (int i = 0; i < entry.getValue().size(); i += 2) {
                contestsSortMap.put(Integer.parseInt(entry.getValue().get(i + 1)), entry.getValue().get(i));
            }
            for (Map.Entry<Integer, String> contest : contestsSortMap.entrySet()) {
                System.out.printf("#  %s -> %d%n", contest.getValue(), contest.getKey());
            }
        }
        
    }
}

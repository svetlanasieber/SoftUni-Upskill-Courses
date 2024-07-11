import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_Judge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Integer>> contest = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!"no more time".equals(input)) {
            String[] tokens = input.split(" -> ");
            String userName = tokens[0];
            String course = tokens[1];
            int userPoints = Integer.parseInt(tokens[2]);

            LinkedHashMap <String,Integer> currentUser = new LinkedHashMap<>();
            currentUser.put(userName,userPoints);

            if(contest.containsKey(course)){
                boolean hasUserName = contest.get(course).containsKey(userName);
                if(hasUserName){
                    int pointsForThisContest = contest.get(course).get(userName);
                    if(userPoints > pointsForThisContest){
                        contest.get(course).put(userName,userPoints);
                    }
                }
                if(!hasUserName){
                    contest.get(course).put(userName,userPoints);
                }
            }

            contest.putIfAbsent(course,currentUser);
            input = scan.nextLine();
        }

        contest
                .forEach((key, value) -> {
                    System.out.printf("%s: %d participants\n", key, value.size());
                    final int[] count1 = {0};
                    value
                            .entrySet()
                            .stream()
                            .sorted((k, v) -> {
                                if (v.getValue() - k.getValue() != 0) {
                                    return v.getValue() - k.getValue();
                                }
                                return k.getKey().compareTo(v.getKey());
                            })
                            .forEach(k -> {
                                count1[0] += 1;
                                System.out.printf("%d. %s <::> %d%n", count1[0], k.getKey(), k.getValue());
                            });
                });

        LinkedHashMap<String, Integer> users = new LinkedHashMap<>();
        for (LinkedHashMap<String, Integer> value : contest.values()) {
            value
                    .forEach((name, value1) -> {
                        int points = value1;
                        if (users.containsKey(name)) {
                            int newPoints = users.get(name) + points;
                            users.put(name, newPoints);
                        }
                        users.putIfAbsent(name, points);
                    });
        }

        System.out.println("Individual standings:");
        final int[] count = {0};
        users
                .entrySet()
                .stream()
                .sorted((a,b) -> {

                    if(b.getValue()- a.getValue() != 0){
                        return b.getValue()-a.getValue();
                    }
                    return a.getKey().compareTo(b.getKey());
                })
                .forEach(k-> {
                    count[0] += 1;
                    System.out.printf("%d. %s -> %d%n", count[0],k.getKey(),k.getValue());
                });
    }
}

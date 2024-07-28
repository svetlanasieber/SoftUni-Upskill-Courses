import java.util.*;

public class P03_ThePianist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPieces = Integer.parseInt(scanner.nextLine());

    
        Map<String, List<String>> collection = new LinkedHashMap<>();

        for (int i = 1; i <= countPieces ; i++) {
           
            String[] currentInput = scanner.nextLine().split("\\|");

         
            String currentPiece = currentInput[0];
            String currentComposer = currentInput[1];
            String currentKey = currentInput[2];

         
            List<String> currentList = new ArrayList<>();

            currentList.add(currentComposer);
            currentList.add(currentKey);

            collection.put(currentPiece, currentList);

        }


        String input = scanner.nextLine();

        while (!input.equals("Stop")){

           
            String currentCommand = input.split("\\|")[0];
            String currentPiece = input.split("\\|")[1];


         
            switch (currentCommand){

                case "Add" -> {

                    if(!collection.containsKey(currentPiece)){
                  
                        List<String> listToAdd = new ArrayList<>();

                    
                        String currentComposerToAdd = input.split("\\|")[2];//Chopin

                        String currentKeyToAdd = input.split("\\|")[3];//B Minor

                       
                        listToAdd.add(currentComposerToAdd);
                        listToAdd.add(currentKeyToAdd);

                        collection.put(currentPiece, listToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentComposerToAdd, currentKeyToAdd);
                    }else {
                        System.out.println(currentPiece + " is already in the collection!");
                    }


                }

                case "Remove" -> {

                    if(!collection.containsKey(currentPiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }else {
                        collection.remove(currentPiece);
                        System.out.printf("Successfully removed %s!%n", currentPiece);
                    }


                }

                case "ChangeKey" -> {

                    if(!collection.containsKey(currentPiece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }else {
                        String newKey = input.split("\\|")[2];

                        collection.get(currentPiece).set(1, newKey);
                   
                        System.out.printf("Changed the key of %s to %s!%n", currentPiece, newKey);


                    }

                }


            }

            input = scanner.nextLine();
        }

        collection.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));


    }
}

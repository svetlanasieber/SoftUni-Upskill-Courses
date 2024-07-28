import java.util.Scanner;
public class P01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder worldTour = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")){

            String[] command = input.split(":");

            switch (command[0]){

                case "Add Stop" -> {

                 
                    int index = Integer.parseInt(command[1]);
                    String destinationToAdd = command[2];

               
                    if (index >= 0 && index < worldTour.length()){
                     
                        worldTour.insert(index, destinationToAdd);
                    }
              
                    System.out.println(worldTour);

                }

                case "Remove Stop" -> {
                   
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]) + 1;

                 
                    if(startIndex >= 0 && endIndex <= worldTour.length()){

                        worldTour.replace(startIndex, endIndex, "");
                    }

                    System.out.println(worldTour);

                }

            
                case "Switch" -> {

                    String oldDestination = command[1];
                    String newDestination = command[2];

                   
                    int firstIndex = worldTour.indexOf(oldDestination);
                    int lastIndex = firstIndex + oldDestination.length();
                   
                    if(worldTour.toString().contains(oldDestination)){
                     
                      worldTour.replace(firstIndex, lastIndex, newDestination);
                    }

                    System.out.println(worldTour);

                }
            }


            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", worldTour);


    }
}

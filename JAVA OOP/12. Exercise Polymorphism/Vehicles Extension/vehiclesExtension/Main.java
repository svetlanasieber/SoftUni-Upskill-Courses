package vehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2]),
                Double.parseDouble(tokens[3]));

        tokens = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2]),
                Double.parseDouble(tokens[3]));

        tokens = scanner.nextLine().split("\\s+");
        Vehicle bus = new Bus(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2]),
                Double.parseDouble(tokens[3]));

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);
        vehicleMap.put("Bus", bus);


        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            tokens = scanner.nextLine().split("\\s+");
            Vehicle vehicle = vehicleMap.get(tokens[1]);
            try {
                switch (tokens[0]) {
                    case "Drive":
                        if("Bus".equals(vehicle.getClass().getSimpleName())){
                            vehicle.turnOnOfAc(vehicle.isEmpty());
                            vehicle.setFuelConsumption(vehicle.getFuelConsumption() + 1.4);
                        }

                        System.out.println(vehicle.drive(Double.parseDouble(tokens[2])));
                        break;
                    case "Refuel":
                        vehicle.refuel(Double.parseDouble(tokens[2]));
                        break;
                    case "DriveEmpty":
                        vehicle.drive(Double.parseDouble(tokens[2]));
                        break;

                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

        }
        vehicleMap.values().forEach(v -> System.out.println(v));
    }
}

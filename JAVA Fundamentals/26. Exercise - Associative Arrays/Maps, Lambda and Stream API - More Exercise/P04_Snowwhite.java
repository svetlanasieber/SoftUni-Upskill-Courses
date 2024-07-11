import java.util.LinkedHashMap;
import java.util.Scanner;

public class P04_Snowwhite {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> dwarf = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"Once upon a time".equals(input)) {
            String[] inputArr = input.split(" <:> ");
            String dwarfName = inputArr[0];
            String dwarfHatColor = inputArr[1];
            String nameColor = String.join(" ", dwarfHatColor, dwarfName);
            int dwarfPhysics = Integer.parseInt(inputArr[2]);

            dwarf.putIfAbsent(nameColor, 0);

            if (dwarf.get(nameColor) < dwarfPhysics) {
                dwarf.put(nameColor, dwarfPhysics);
            }
          
            input = scanner.nextLine();
        }

        dwarf.entrySet()
                .stream()
                .sorted((d1, d2) -> {
                    Integer d1physic = d1.getValue();
                    Integer d2physic = d2.getValue();
                    int sort = d1physic.compareTo(d2physic);
                    if (sort == 0) {
                        String color1 = d1.getKey().split(" ")[0];
                        String color2 = d2.getKey().split(" ")[0];
                        int countColor1 = (int) dwarf.entrySet().stream().filter(entry -> entry.getKey().split(" ")[0].equals(color1)).count();
                        int countColor2 = (int) dwarf.entrySet().stream().filter(entry -> entry.getKey().split(" ")[0].equals(color2)).count();
                        return Integer.compare(countColor2, countColor1);
                    }
                    return Integer.compare(d2physic, d1physic);

                }).forEach(d -> {
                    String color = d.getKey().split(" ")[0];
                    String name = d.getKey().split(" ")[1];
                    Integer physic = d.getValue();

                    System.out.printf("(%s) %s <-> %d%n", color, name, physic);
                });
    }
}

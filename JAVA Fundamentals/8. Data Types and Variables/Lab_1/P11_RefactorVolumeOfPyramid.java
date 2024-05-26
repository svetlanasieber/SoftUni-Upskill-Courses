package DataTypesVariablesLab;

import java.util.Scanner;

public class P11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* Example code: double dul, sh, V = 0;
        System.out.print("Length: ");
        dul = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        sh = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        V = Double.parseDouble(scanner.nextLine());
        V = (dul * sh * V) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
*/


                // Read the length, width, and height of the pyramid
                System.out.print("Length: ");
                double length = Double.parseDouble(scanner.nextLine());

                System.out.print("Width: ");
                double width = Double.parseDouble(scanner.nextLine());

                System.out.print("Height: ");
                double height = Double.parseDouble(scanner.nextLine());

                // Calculate the volume of the pyramid
                double volume = (length * width * height) / 3;

                // Print the pyramid volume
                System.out.printf("Pyramid Volume: %.2f", volume);


            }
        }


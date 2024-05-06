package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectureName = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());


        int neededHours = projectsCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectureName, neededHours, projectsCount);

        //•	"The architect {името на архитекта} will need {необходими часове}
        // hours to complete {брой на проектите} project/s."
    }
}

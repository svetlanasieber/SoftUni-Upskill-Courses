import java.util.Scanner;

public class P09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int studentCount= Integer.parseInt(sc.nextLine());
        double priceSaber = Double.parseDouble(sc.nextLine());
        double priceRobe = Double.parseDouble(sc.nextLine());
        double priceBelt = Double.parseDouble(sc.nextLine());

        double sumSaber = Math.ceil(studentCount + 0.10 * studentCount) * priceSaber;
        double sumRobes = studentCount * priceRobe;
        double sumBelts = (studentCount - studentCount / 6) * priceBelt;
        double total = sumSaber + sumRobes + sumBelts;

        if(budget >= total){

            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            double needMoney = total - budget;
            System.out.printf("George Lucas will need %.2flv more.",needMoney);
        }


    }
}

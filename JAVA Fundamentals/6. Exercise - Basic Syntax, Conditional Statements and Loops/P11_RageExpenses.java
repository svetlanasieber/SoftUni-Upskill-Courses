import java.util.Scanner;

public class P11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //                Every second lost game, Peter trashes his headset.        *3
//                Every third lost game, Peter trashes his mouse.           *2
//                When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.    *1
//                 Every second time, when he trashes his keyboard, he also trashes his display.    *0.5

        int countHeadsets = lostGames/2;
        int countMouses = lostGames/3;
        int countKeyboards = lostGames/6;
        int countDisplays = lostGames/12;

        double expenses = countHeadsets*headsetPrice+countMouses*mousePrice+countKeyboards*keyboardPrice+countDisplays*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",expenses);
    }
}

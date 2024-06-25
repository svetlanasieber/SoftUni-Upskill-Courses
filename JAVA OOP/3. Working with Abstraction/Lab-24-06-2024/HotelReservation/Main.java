package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split("\\s+");
        
        double priceForDay = Double.parseDouble(inputData[0]);
        int days = Integer.parseInt(inputData[1]);
        String season = inputData[2];
        String discountType = inputData[3];

        PriceCalculator calculator = new PriceCalculator(priceForDay, days, season, discountType);
        calculatePriceWithoutDiscount(calculator);
        calculatePriceWithDiscount(calculator);
        System.out.println(calculator.toString());
    }

    private static void calculatePriceWithDiscount(PriceCalculator calculator) {
        switch (calculator.getDiscountType()) {
            case "VIP":
                calculator.setAllPrice(calculator.getAllPrice() - (calculator.getAllPrice() * 0.20));
                break;
            case "SecondVisit":
                calculator.setAllPrice(calculator.getAllPrice() - (calculator.getAllPrice() * 0.10));
                break;
        }
    }

    private static void calculatePriceWithoutDiscount(PriceCalculator calculator) {
        switch (calculator.getSeason()) {
            case "Summer":
                calculator.setAllPrice((calculator.getPriceForDay() * 4) * calculator.getDays());
                break;
            case "Winter":
                calculator.setAllPrice((calculator.getPriceForDay() * 3) * calculator.getDays());
                break;
            case "Spring":
                calculator.setAllPrice((calculator.getPriceForDay() * 2) * calculator.getDays());
                break;
            case "Autumn":
                calculator.setAllPrice(calculator.getPriceForDay() * calculator.getDays());
                break;
        }
    }
}

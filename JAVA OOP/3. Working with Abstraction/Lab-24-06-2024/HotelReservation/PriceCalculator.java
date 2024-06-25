package HotelReservation;

public class PriceCalculator {
    private double priceForDay;
    private int days;
    private String season;
    private String discountType;
    private double allPrice;

    public PriceCalculator(double priceForDay, int days, String season, String discountType) {
        this.priceForDay = priceForDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
        this.allPrice = 0;
    }

    public double getPriceForDay() {
        return priceForDay;
    }

    public int getDays() {
        return days;
    }

    public String getSeason() {
        return season;
    }

    public String getDiscountType() {
        return discountType;
    }

    public double getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(double allPrice) {
        this.allPrice = allPrice;
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.allPrice);
    }
}

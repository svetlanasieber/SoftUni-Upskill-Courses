package Pizza_Calories;

import java.util.Map;

public class Topping {
	private String toppingType;
	private double weight;
	private static final Map<String, Double> VALID_TOPPINGS = Map.of("Meat", 1.2, "Veggies", 0.8, "Cheese", 1.1,
			"Sauce", 0.9);

	public Topping(String toppingType, double weight) {
		setToppingType(toppingType);
		setWeight(weight);
	}

	private void setToppingType(String toppingType) {
		if (!VALID_TOPPINGS.containsKey(toppingType)) {
			throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
		}
		this.toppingType = toppingType;
	}

	private void setWeight(double weight) {
		if (weight < 1 || weight > 50) {
			throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
		}
		this.weight = weight;
	}

	public double calculateCalories() {
		double toppingCalories = VALID_TOPPINGS.get(this.toppingType);
		return weight * 2 * toppingCalories;

	}

}

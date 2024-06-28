package Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String name;
	private Dough dough;

	private List<Topping> toppings;

	public Pizza(String name, int numberOfToppings) {
		setName(name);
		setToppings(numberOfToppings);
		toppings = new ArrayList<>();
	}

	private void setToppings(int n) {
		if (n < 0 || n > 10) {
			throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
		}

	}

	private void setName(String name) {
		if (name == null || name.trim().isEmpty() || name.length() > 15) {
			throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
		}
		this.name = name;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public String getName() {
		return name;
	}

	public void addTopping(Topping topping) {

		if (this.toppings.size() == Main.numbOfToppings) {
			throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
		}
		this.toppings.add(topping);
	}

	public double getOverallCalories() {
		double toppingCalories = toppings.stream().mapToDouble(x -> x.calculateCalories()).sum();
		double overallCalories = dough.calculateCalories() + toppingCalories;
		return overallCalories;

	}

}

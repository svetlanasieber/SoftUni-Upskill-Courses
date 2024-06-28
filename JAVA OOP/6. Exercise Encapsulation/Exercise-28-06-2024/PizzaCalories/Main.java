package Pizza_Calories;

import java.util.Scanner;

public class Main {
	static int numbOfToppings;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] inp1 = sc.nextLine().split(" ");
		numbOfToppings = Integer.parseInt(inp1[2]);
		Pizza pizza = new Pizza(inp1[1], numbOfToppings);

		String[] inp2 = sc.nextLine().split(" ");
		Dough dough = new Dough(inp2[1], inp2[2], Double.parseDouble(inp2[3]));
		pizza.setDough(dough);

		String[] inp3 = sc.nextLine().split(" ");

		while (!inp3[0].equals("END")) {

			Topping topping = new Topping(inp3[1], Double.parseDouble(inp3[2]));
			pizza.addTopping(topping);
			inp3 = sc.nextLine().split(" ");

		}
		System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
		sc.close();
	}

}

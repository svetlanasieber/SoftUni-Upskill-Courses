import java.util.Scanner;

public class P04_VariationsWithRepetition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] elements = sc.nextLine().split(" ");

		int k = Integer.parseInt(sc.nextLine());

		String[] slots = new String[k];

		permute(elements, slots, 0);

		sc.close();

	}

	private static void permute(String[] elements, String[] slots, int index) {
		if (index == slots.length) {
			print(slots);
			return;
		}

		for (int i = 0; i < elements.length; i++) {
			slots[index] = elements[i];
			permute(elements, slots, index + 1);

		}

	}

	private static void print(String[] permutes) {
		System.out.println(String.join(" ", permutes));

	}
}

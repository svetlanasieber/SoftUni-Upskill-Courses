import java.util.Scanner;

public class P03_VariationsWithoutRepetition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] elements = sc.nextLine().split(" ");
		
		int k = Integer.parseInt(sc.nextLine());
		
		String[] slots = new String[k];
		boolean[] used = new boolean[elements.length];

		permute(elements, slots, used, 0);

		sc.close();

	}

	private static void permute(String[] elements, String[] slots, boolean[] used, int index) {
		if (index == slots.length) {
			print(slots);
			return;
		}

		for (int i = 0; i < elements.length; i++) {
			if (!used[i]) {
				used[i] = true;

				slots[index] = elements[i];
				permute(elements, slots, used, index + 1);

				used[i] = false;
			}
		}

	}

	private static void print(String[] permutes) {
		System.out.println(String.join(" ", permutes));

	}

}

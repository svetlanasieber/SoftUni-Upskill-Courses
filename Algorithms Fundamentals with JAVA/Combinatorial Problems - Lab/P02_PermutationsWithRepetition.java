import java.util.HashSet;
import java.util.Scanner;

public class P02_PermutationsWithRepetitions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] elements = sc.nextLine().split(" ");

		permute(elements, 0);

		sc.close();

	}

	private static void permute(String[] elements, int index) {
		if (index == elements.length) {
			print(elements);
			return;
		}
		permute(elements, index + 1);

		HashSet<String> swapped = new HashSet<>();
		swapped.add(elements[index]);

		for (int i = index + 1; i < elements.length; i++) {
			if (!swapped.contains(elements[i])) {
				swap(elements, index, i);
				permute(elements, index + 1);
				swap(elements, index, i);
				
				swapped.add(elements[i]);
			}
		}
	}

	private static void swap(String[] arr, int first, int second) {
		String temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

	private static void print(String[] permutes) {
		System.out.println(String.join(" ", permutes));

	}

}

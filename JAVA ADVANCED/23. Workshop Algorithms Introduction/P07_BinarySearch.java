import java.util.Arrays;
import java.util.Scanner;

public class P07_BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int key = Integer.parseInt(scanner.nextLine());

        System.out.println(getIndex(array, key));
    }
    public static int getIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

/*import java.util.Arrays;
import java.util.Scanner;

public class P07_BinarySearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int number = Integer.parseInt(scan.nextLine());

        int index = getIndex(numbers, number);

        System.out.println(index);
    }

    public static int getIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] == key) {
                return start;
            }
            start++;
        }
        return -1;
    }
}*/

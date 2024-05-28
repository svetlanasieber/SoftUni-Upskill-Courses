import java.util.Scanner;

public class P02_RecursiveFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
		
        System.out.println(calcFact(n));

    }

    public static long calcFact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        return n * calcFact(n - 1);
    }
}

/*import java.util.Scanner;

public class P02_RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}*/

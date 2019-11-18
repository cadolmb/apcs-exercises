import java.util.Scanner;

public class FactorialWithErrorFlag {

    public static void main(String[] args) {
        boolean inputing = true;
        Scanner scanner = new Scanner(System.in);

        while (inputing) {
            System.out.println("enter a negative to quit");
            System.out.println("Enter a number: ");

            int input = scanner.nextInt();
            if (input < 0)
                System.exit(0);

            long factorial = factorial(input);
            if (factorial == -1) {
                System.out.println("error");
                continue;
            }

            System.out.println(factorial(input));
        }
    }

    public static long factorial(int n) {
        if (n > 20 || n < 0)
            return -1;

        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
}

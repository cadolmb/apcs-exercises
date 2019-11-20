import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputing = true;

        System.out.println("Enter N and R for N combinations of R");
        System.out.println("N > R > 0");

        while (inputing) {
            System.out.print("Enter N: ");
            int n = scanner.nextInt();
            System.out.print("Enter R: ");
            int r = scanner.nextInt();

            if (n < 0 || r < 0)
                System.exit(0);

            long nf = factorial(n);
            if (nf == -1) {
                System.out.println("error");
                continue;
            }
            long rf = factorial(r);
            if (rf == -1) {
                System.out.println("error");
                continue;
            }

            long result = nf / (rf * factorial((n-r)));
            System.out.println(result);
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

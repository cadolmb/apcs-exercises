import java.util.Scanner;

public class OdiousNumbers {

    public static void main(String[] args) {
        boolean inputing = true;
        Scanner scanner = new Scanner(System.in);

        while (inputing) {
            int input = scanner.nextInt();
            if (input < 0)
                System.exit(0);

            // LOGIC FOR ODIOUS NUMBERS
            int n = input;
            int numberOf1s = 0;
            while (n > 0) {
                if (n % 2 == 1)
                    numberOf1s ++;
                n = n / 2;
            }

            if (numberOf1s % 2 == 1)
                System.out.println(input + " is odious.");
            else
                System.out.println(input + " is evil.");
        }
    }
}

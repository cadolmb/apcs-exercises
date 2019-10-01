import java.util.*;

public class ImprovedGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(
            "I am thinking of a number from 1 to 10." +
            "\nYou must guess what it is in three tries." +
            "\nEnter a guess:"
        );

        int n = random.nextInt(10) + 1;
        int guess;
        int tries = 3;

        for (int i = tries; i > 0; i--) {
            guess = scanner.nextInt();
            int d = Math.abs(guess - n);

            if (d == 0) {
                System.out.println("RIGHT!\nYou have won the game.");
                return;
            }
            else if (d == 1) {
                System.out.println("hot");
            }
            else if (d == 2) {
                System.out.println("warm");
            }
            else {
                System.out.println("cold");
            }
        }
    }
}

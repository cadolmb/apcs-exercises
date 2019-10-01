import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("I am thinking of a number from 1 to 10." +
            "\nYou must guess what it is in three tries." +
            "\nEnter a guess:");

        int guess;
        int r = random.nextInt(10) + 1;

        for (int guesses = 0; guesses < 3; guesses++) {
            guess = scanner.nextInt();

            if (guess == r) {
                System.out.println("RIGHT!\nYou have won the game.");
                break;
            } else {
                System.out.println("wrong");
            }
        }
    }

}

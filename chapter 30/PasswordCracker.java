import java.util.Scanner;
import java.util.ArrayList;

public class PasswordCracker {

    private static final int maxPassLength = 4;

    //private static String choices = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
    private static String choices = "abcdefghijklmnopqrstuvwxyz";
    private static String password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Enter a password that is " + maxPassLength + " or less characters long" +
            //"\nand contains only letters and numbers"
            "\nand contains only lowercase letters:\n"
        );

        password = scanner.nextLine();

        if (!validInput(password)) {
            System.out.println("Invalid input");
            return;
        }

        // CRACK PASSWORD
        for (int guessLength = 1; guessLength <= maxPassLength; guessLength++) {
            // String guess = "";
            // char firstChoice = choices.charAt(0);
            // for (int i = 0; i < guessLength; i++) { guess += firstChoice; }

            for (int guessIndex = 0; guessIndex < guessLength; guessIndex++) {
                // string here
                for (int choiceIndex = 0; choiceIndex < choices.length(); choiceIndex++) {
                    // test here
                }

            }

        }

    }

    private static boolean validInput(String s) {

        if (s.length() > maxPassLength) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (choices.indexOf(s.charAt(i)) == -1) {
                return false;
            }
        }

        return true;
    }

}

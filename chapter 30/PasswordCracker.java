import java.util.Scanner;

public class PasswordCracker {

    private static final int maxPassLength = 4;

    //private static String choices = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
    private static String choices = "abcdefghijklmnopqrstuvwxyz";
    //private static String choices = "1234567890";

    public static void main(String[] args) {

        // GET INPUT
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\nEnter a password that is " + maxPassLength + " or less characters long" +
            //"\nand contains only letters and numbers:\n"
            "\nand contains only lowercase letters:\n"
            //"\nand contains only numbers:\n"
        );

        String input = scanner.nextLine();

        if (!validInput(input)) {
            System.out.println("Invalid input");
            return;
        }

        // CRACK PASSWORD
        String guess = "" + choices.charAt(0);
        boolean cracked = false;
        int attempts = 0;

        while (!cracked) {
            if (guess.equals(input)) {
                System.out.println("\nCracked!!! - " + guess);
                System.out.println("It took " + attempts + " attempts of brute force.");
                cracked = true;
            }
            else {
                guess = nextChoiceString(guess);
                attempts++;
                System.out.println(guess); // FOR MAXIMUM SPEED LEAVE COMMENTED
            }
        }

    }

    // GENERATES NEXT POSSIBLE STRING USING CHOICE CHARACTERS
    private static String nextChoiceString(String s) {
        String nextString;
        char last = s.charAt(s.length() - 1);
        int index = choices.indexOf(last);

        String substr = s.substring(0, s.length() - 1);
        char firstChoice = choices.charAt(0);

        if (index == choices.length() - 1) {
            if (s.length() > 1) {
                nextString = nextChoiceString(substr) + firstChoice;
            }
            else {
                nextString = "" + firstChoice + firstChoice;
            }
        }
        else {
            index++;
            nextString = substr + choices.charAt(index);
        }

        return nextString;
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

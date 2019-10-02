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
        int guessNum = 0;
        String guess = "";
        while (guess != password) {
            System.out.println("\nguessnum - " + guessNum);

            guess = GuessNumToString(guessNum);

            System.out.println("guess: " + guess + "\n");
            guessNum++;

            if (guessNum > 500) return;
        }
    }

    private static String GuessNumToString(int n) {
        ArrayList<Character> chars = new ArrayList<Character>();
        int basePerm = choices.length();

        for (int i = 1; n >= 0; i++) {
            int perm = (int) Math.pow((double) basePerm, (double) i);
            int rem = n % basePerm;

            System.out.println(n + " - " + perm + " - " + rem);

            chars.add(choices.charAt(rem));
            n -= perm;
        }

        // CONVERTING ARRAY LIST TO STRING AND RETURNING
        char[] ca = new char[chars.size()];
        for (int i = 0; i < chars.size(); i++) { ca[i] = chars.get(i); }
        String s = new String(ca);
        return s;
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

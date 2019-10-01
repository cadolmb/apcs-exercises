import java.util.Scanner;

public class PasswordCracker {

    private static final int maxPassLength = 4;

    //private static String choices = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
    private static String choices = "abcdefghijklmnopqrstuvwxyz";
    private static String password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Enter a password that is" + maxPassLength + " or less characters long" +
            //"\nand contains only letters and numbers"
            "\nand contains only lowercase letters"
        );

        password = scanner.nextLine();

        if (!validInput(password)) {
            System.out.println("Invalid input");
            return;
        }

        crackPassword();
    }

    private static void crackPassword() {
        // INSERT CODE HERE
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

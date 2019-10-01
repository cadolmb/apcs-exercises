import java.util.Scanner;

public class PasswordCracker {

    //private static String choices = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
    private static String choices = "abcdefghijklmnopqrstuvwxyz";
    private static String password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Enter a password that is 5 or less characters long" +
            //"\nand contains only letters and numbers"
            "\nand contains only lowercase letters"
        );

        password = scanner.nextLine();

        if (!validInput) {
            System.out.println("Invalid input");
            return;
        }

        // CRACK PASSWORD
        boolean cracked = false;
        String s;
        while (cracked == false) {
            for (int i = 0; i < choices.length(); i++) {
                for (int j = 0; j < choices.length(); j++) {

                }
            }
        }

        s = "";
        s += choices.charAt(i);
        if (s == password) {
            break;
        }
    }

    private static boolean validInput(String s) {

        if (s.length() > 5) {
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

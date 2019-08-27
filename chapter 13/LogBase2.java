import java.util.Scanner;

public class LogBase2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number: ");
    String input = s.nextLine();
    double n = Double.parseDouble(input);
    double answer = Math.log(n) / Math.log(2);
    System.out.println("Log base 2 of that number is: " + answer);
  }

}

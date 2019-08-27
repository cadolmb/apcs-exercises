import java.util.Scanner;

public class CorrectChange {

  public static void main(String[] args) {

    String input;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter amount of change in cents: ");
    input = s.nextLine();
    int change = Integer.parseInt(input);

    int quarters = change / 25;
    change -= quarters * 25;
    int dimes = change / 10;
    change -= dimes * 10;
    int nickles = change / 5;
    change -= nickles * 5;
    int pennies = change;

    System.out.println("Your change is: ");
    System.out.println(quarters + " quarters");
    System.out.println(dimes + " dimes");
    System.out.println(nickles + " nickles");
    System.out.println(pennies + " pennies");
  }

}

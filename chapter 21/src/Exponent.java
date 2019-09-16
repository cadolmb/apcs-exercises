import java.util.Scanner;

public class Exponent {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter X");
    double x = s.nextDouble();
    System.out.println("Enter N");
    int n = s.nextInt();
    if (n <= 0) {
      System.out.println("\nN must be a positive integer.");
      return;
    }

    int i = 0;
    double product = 1;
    while (i < n) {
      product *= x;
      i ++;
    }

    System.out.println("\n" + x + " raised to the power " + n + " is: " + product);
  }

}

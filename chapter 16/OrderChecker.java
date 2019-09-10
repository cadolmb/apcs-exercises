import java.util.Scanner;

public class OrderChecker {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter number of bolts: ");
    int bolts = s.nextInt();
    System.out.println("Enter number of nuts: ");
    int nuts = s.nextInt();
    System.out.println("Enter number of washers: ");
    int washers = s.nextInt();

    int totalPrice = 5*bolts + 3*nuts + washers;

    System.out.println("\n" + orderStatus(bolts, nuts, washers));
    System.out.println("\nPrice is: \n" + totalPrice);
  }

  private static String orderStatus(int b, int n, int w) {
    if (n >= b && w >= 2*b)
      return "Order is OK";

    if (n < b && w < 2*b)
      return "Check the Order: too few nuts" + "\nCheck the Order: too few nuts";

    if (n < b)
      return "Check the Order: too few nuts";

    if (w < 2*b)
      return "Check the Order: too few washers";

    return "ERROR";
  }

}

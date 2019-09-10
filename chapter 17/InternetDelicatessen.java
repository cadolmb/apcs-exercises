import java.util.Scanner;

public class InternetDelicatessen {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the item: ");
    String item = s.nextLine();
    System.out.print("Enter the price: ");
    int price = s.nextInt();
    System.out.print("Overnight delivery (0 = no, 1 = yes):");
    boolean expressDelivery = (s.nextInt() == 1);

    int deliveryFee;
    if (price < 1000)
      deliveryFee = 200;
    else
      deliveryFee = 0;
    if (expressDelivery)
      deliveryFee += 300;

    int total = price + deliveryFee;

    System.out.println("\n Invoice:");
    System.out.println("\t" + item + "\t" + price);
    System.out.println("\t" + "delivery" + "\t" + deliveryFee);
    System.out.println("\t" + "total" + "\t" + total);
  }

}

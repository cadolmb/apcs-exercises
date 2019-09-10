import java.util.Scanner;

public class DiscountPrices {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter price in cents: ");

    int price = s.nextInt();
    if (price > 1000)
      price *= 0.9;
    System.out.println("Dicounted price: " + price + " cents.");
  }

}

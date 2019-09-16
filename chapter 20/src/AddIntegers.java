import java.util.Scanner;

public class AddIntegers {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("\nHow many integers will be added: ");
    int amountToAdd = s.nextInt();

    int i = 0;
    int sum = 0;
    while (i < amountToAdd) {
      System.out.println("Enter an integer:");
      sum += s.nextInt();
      i ++;
    }

    System.out.println("\nThe sum is " + sum);
  }

}

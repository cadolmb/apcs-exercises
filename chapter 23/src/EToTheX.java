import java.util.Scanner;

public class EToTheX {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x;
    double currentTerm = 1;
    double sum = 0;

    System.out.println("Enter x: ");
    x = s.nextInt();

    int n = 0;
    while (currentTerm > 1.0e-12) {
      currentTerm = Math.pow(x, n) / factorial(n);
      sum += currentTerm;
      System.out.println("n:" + n + "\tterm: " + currentTerm + "\tsum: " + sum);
      n ++;
    }

    System.out.println("\nmy e^x: " + sum);
    System.out.println("real e^x: " + Math.exp(x));
  }

  private static int factorial(int n) {
    int product = 1;
    for (int i = 1; i <= n; i++) {
      product *= i;
    }
    return product;
  }

}

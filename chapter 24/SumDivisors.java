import java.util.Scanner;

public class SumDivisors {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number N: ");
    int n = s.nextInt();

    int sum = 1;
    for (int i = 2; i <= n/2; i++) {
      if (n % i == 0)
        sum += i;
    }

    System.out.println("Sum of divisors from 1 to N: " + sum);
    if (sum == n)
      System.out.println("Perfect Number!");
  }
}

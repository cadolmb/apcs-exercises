import java.util.Scanner;

public class SumOddInts {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number N: ");
    int n = s.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1)
        sum += i;
    }
    System.out.println("Sum of odd integers from 1 to N: " + sum);
    System.out.println("N^2: " + n*n);
  }
}

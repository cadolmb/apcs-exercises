import java.util.Scanner;

public class HarmonicSum {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter N");
    int n = s.nextInt();

    int i = 0;
    double sum = 0;
    while (i < n) {
      sum += 1.0/(i + 1);
      i ++;
    }

    System.out.println("\nThe sum is " + sum);
  }

}

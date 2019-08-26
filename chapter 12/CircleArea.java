import java.util.Scanner;

public class CircleArea {

  public static void main (String[] args) {
    String input;
    Scanner s = new Scanner(System.in);

    System.out.println("Give me the radius of a circle: ");
    input = s.nextLine();
    int r = Integer.parseInt(input);
    double area = Math.PI * (r*r);
    System.out.println("Area: " + area);
  }

}

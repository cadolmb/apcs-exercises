import java.util.Scanner;

public class MilesPerGallon {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int initialMiles;
    int finalMiles;
    int gallons;
    double milesPerGallon;

    while (true) {
      System.out.println("\nInitial miles: ");
      initialMiles = s.nextInt();
      if (initialMiles < 0)
        break;
      System.out.println("Final miles: ");
      finalMiles = s.nextInt();
      System.out.println("Gallons: ");
      gallons = s.nextInt();

      milesPerGallon = (double)(finalMiles - initialMiles) / gallons;
      System.out.println("Miles per Gallon: " + milesPerGallon);
    }
    System.out.println("bye");
  }

}

public class SheepHerdSize {

  public static void main(String[] args) {
    double n;
    double power = 1;
    double yearsSupervized = 0;

    for (int t = 0; t <= 25; t++) {
      power *= 0.83;
      n = 220 / (1 + 10*power);
      if (yearsSupervized == 0 && n >= 80)
        yearsSupervized = t;
      System.out.println(n);
    }
    System.out.println("Years supervised: " + yearsSupervized);
  }

}

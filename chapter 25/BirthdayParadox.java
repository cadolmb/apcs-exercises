public class BirthdayParadox {

  public static void main(String[] args) {
    
    double prob = 1.0;
    int days;
    int people = 1;
    for (days = 364; prob > 0.5; days--) {
      prob *= (double) days / 365;
      people ++;
      System.out.println(days + " - " + prob);
    }
    System.out.println("There is a good chance that out of " +
      people + " people, two share the same birthday");
  }

}

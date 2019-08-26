public class StringDemo3 {

  public static void main(String[] args) {

    String str = new String("Golf is a good walk spoiled.");
    for (int i = 0; i <= str.length(); i++) {
      System.out.println(str.substring(i));
    }

  }

}

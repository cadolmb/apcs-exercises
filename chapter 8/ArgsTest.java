public class ArgsTest {

  public static void main(String[] args) {

    for (int i = 0; i < args.length; i++) {
      try {
        System.out.println(args[i]);
      }
      catch (Exception e) {
        System.out.println("Error: " + e);
      }
    }

  }

}

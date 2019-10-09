public class Util {

    public static boolean contains(int[] array, int n) {
        boolean b = false;
        for (int i : array) {
            if (i == n)
                b = true;
        }
        return b;
    }

    public static void inputError() {
        System.out.println("\nYour input was incorrect.\n");
        System.exit(1);
    }

}

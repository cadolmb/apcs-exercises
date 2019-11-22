import java.io.* ;

class NearlyZero {

  public static void main ( String[] args ) {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

    // declare and initialize variables
    int closestToZero = data[0];

    // find the element nearest to zero
    for (int i : data) {
        if (i < closestToZero && i > 0)
            closestToZero = i;
    }

    // write out the element nearest to zero
    System.out.println(closestToZero);

  }
}

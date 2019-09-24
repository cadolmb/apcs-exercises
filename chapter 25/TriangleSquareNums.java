public class TriangleSquareNums {

  public static void main(String[] args) {

    int triangleNum = 0;
    for (int i = 1; triangleNum < 1000000000; i++) {
      triangleNum += i;
      double sqrt = Math.sqrt((double) triangleNum);
      if (sqrt == Math.floor(sqrt))
        System.out.println(triangleNum);
    }
  }

}

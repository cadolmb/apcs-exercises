import java.util.Scanner;
import java.util.ArrayList;

class CoffeeAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> data = new ArrayList<Double>();
        while (scanner.hasNext()) {
            data.add( Double.parseDouble(scanner.nextLine()) );
        }

        for (double d : data) {
            System.out.println(d);
        }
    }
}

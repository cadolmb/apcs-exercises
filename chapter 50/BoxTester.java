public class BoxTester {

    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

        Box biggerBox = box.biggerBox();
        Box smallerBox = box.smallerBox();

        printBoxProperties(box);
        printBoxProperties(biggerBox);
        printBoxProperties(smallerBox);
    }

    private static void printBoxProperties(Box box) {
        System.out.println("\n\nBox Properties:");
        System.out.println("length: " + box.length());
        System.out.println("width: " + box.width());
        System.out.println("height: " + box.height());
        System.out.println("area: " + box.area());
        System.out.println("volume: " + box.volume());
    }
}

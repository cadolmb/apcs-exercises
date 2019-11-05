public class Box {

    private double width;
    private double height;
    private double length;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double side) {
        width = side;
        height = side;
        length = side;
    }

    public Box(Box oldBox) {
        length = oldBox.length();
        width = oldBox.width();
        height = oldBox.height();
    }

    public Box biggerBox() {
        return new Box(length*1.25, width*1.25, height*1.25);
    }

    public Box smallerBox() {
        return new Box(length*0.75, width*0.75, height*0.75);
    }

    public boolean nests(Box outsideBox) {
        if (length < outsideBox.length() && width < outsideBox.width() && height < outsideBox.height()) {
            return true;
        }
        return false;
    }

    public double volume() {
        return length*width*height;
    }

    public double area() {
        return 2*length*width + 2*length*height + 2*width*height;
    }

    public double length() {return length;}
    public double width() {return width;}
    public double height() {return height;}

}

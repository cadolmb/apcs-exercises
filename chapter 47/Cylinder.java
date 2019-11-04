public class Cylinder {

    private double r;
    private double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double area() {
      return 2*Math.PI*r*r + Math.PI*2*r*h;
    }

    public double volume() {
      return Math.PI*r*r*h;
    }

    public double slantHeight() {
        return Math.sqrt(r*r + h*h);
    }

    public double angle() {
        return Math.atan(r/h);
    }

}

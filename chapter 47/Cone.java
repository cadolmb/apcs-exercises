public class Cone {

    private double r;
    private double h;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double area() {
      return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
    }

    public double volume() {
      return Math.PI*radius*radius*height/3.0;
    }

    public double slantHeight() {
        return Math.sqrt( Math.pow(r,2) + Math.pow(h,2) );
    }

    public double angle() {
        return Math.atan(r/h);
    }

}

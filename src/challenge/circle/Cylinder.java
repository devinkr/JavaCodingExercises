package challenge.circle;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = Math.max(height, 0);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }
}

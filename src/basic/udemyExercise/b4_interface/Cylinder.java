package basic.udemyExercise.b4_interface;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double heig) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }
}
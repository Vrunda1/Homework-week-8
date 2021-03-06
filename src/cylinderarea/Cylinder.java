package cylinderarea;

public class Cylinder extends Circle {
    double height;

    //constructor with argument
    public Cylinder(double radius, double height) {
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
        return this.height * this.getArea();
    }

}

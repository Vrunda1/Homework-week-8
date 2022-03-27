package carpetcost;

public class Floor {
    double width;
    double length;

    public  Floor(double width, double length) {
        if (width < 0 && length > 0) {
            this.width = 0;
            this.length = length;
        } else if (width > 0 && length < 0) {
            this.length = 0;
            this.width = width;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }
}




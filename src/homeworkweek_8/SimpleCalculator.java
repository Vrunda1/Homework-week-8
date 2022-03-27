package homeworkweek_8;

public class SimpleCalculator {
    double firstnumber;
    double secondnumber;

    public double getFirstNumber() {
        return firstnumber;
    }

    public double getSecondnumber() {
        return secondnumber;
    }

    public void setFirstNumber(double firstnumber) {
        this.firstnumber = firstnumber;
    }

    public void setSecondnumber(double secondnumber) {
        this.secondnumber = secondnumber;
    }

    public double getAdditionResult() {
        return firstnumber + secondnumber;
    }

    public double getSubtractionResult() {
        return secondnumber - firstnumber;
    }

    public double getMultiplicationResult() {
        return firstnumber * secondnumber;
    }

    public double getDivisionResult() {
        if (secondnumber == 0) {
            return 0;
        } else {
            return firstnumber / secondnumber;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondnumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondnumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }
}

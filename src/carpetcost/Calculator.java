package carpetcost;

public class Calculator {
    Floor floor;
    Carpet carpet;

    //construtor with parameter
    public Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost() {
        //calculate area
        return floor.getArea() * carpet.getCost();

    }
}

package week5.experiment2;

public class Car {
    private String name;
    private int cost;

    public Car() {
        this.name = "Car";
        this.cost = 100;
    }

    public int carCostCalculation(int days) {
        return cost * days;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

}

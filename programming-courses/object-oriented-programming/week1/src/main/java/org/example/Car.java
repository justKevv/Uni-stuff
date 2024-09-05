package org.example;

public class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfSeats;

    public Car(String brand, int year, int speed, int fuelLevel, int numberOfDoors, int numberOfSeats) {
        super(brand, year, speed, fuelLevel);
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
    }

    public void accelerate(int increase) {
        setSpeed(getSpeed() + increase);
        System.out.println("Accelerating to " + getSpeed() + " mph");
    }

    public void decelerate(int decrease) {
        setSpeed(getSpeed() - decrease);
        System.out.println("Decelerating to " + getSpeed() + " mph");
    }

    public void fillUp(int amount) {
        setFuelLevel(getFuelLevel() + amount);
        System.out.println("Filling up with " + amount + " liters of fuel");
    }

}



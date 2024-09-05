package org.example;

public class Motorcycle extends Vehicle {
    private int cc;
    
    public Motorcycle(String brand, int year, int speed, int fuelLevel, int cc) {
        super(brand, year, speed, fuelLevel);
        this.cc = cc;
    }

    public void revEngine() {
        System.out.println("Revving the engine");
    }
}

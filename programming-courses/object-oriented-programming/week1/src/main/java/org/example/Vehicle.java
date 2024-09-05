package org.example;

public class Vehicle {

    private String brand;
    private int year;
    private int speed;
    private int fuelLevel;

    public Vehicle(String brand, int year, int speed, int fuelLevel) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}

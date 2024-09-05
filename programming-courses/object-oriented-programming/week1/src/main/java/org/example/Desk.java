package org.example;

public class Desk extends Furniture {
    private int numberOfShelves;
    private String brand;

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Desk(String material, int length, int width, int numberOfShelves, String brand) {
        super(material, length, width);
        this.numberOfShelves = numberOfShelves;
        this.brand = brand;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of shelves: " + numberOfShelves);
        System.out.println("Brand: " + brand);
    }
    
}

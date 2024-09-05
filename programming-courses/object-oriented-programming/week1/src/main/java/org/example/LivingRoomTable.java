package org.example;

public class LivingRoomTable extends Furniture {
    private int numberOfDrawers;
    private String brand;

    public void setNumberOfDrawers(int numberOfDrawers) {
        this.numberOfDrawers = numberOfDrawers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LivingRoomTable(String material, int length, int width, int numberOfDrawers, String brand) {
        super(material, length, width);
        this.numberOfDrawers = numberOfDrawers;
        this.brand = brand;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public String getbrand() {
        return brand;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Number of drawers: " + numberOfDrawers);
    }

}

package org.example;

public class Furniture {
    private String material;
    private int length;
    private int width;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Furniture(String material, int length, int width) {
        this.material = material;
        this.length = length;
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void showInfo() {
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " inches");
        System.out.println("Width: " + width + " inches");
    }
    
}

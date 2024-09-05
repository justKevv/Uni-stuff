package org.example;

public class Lightbulb {
    private int wattage;
    private String type;
    private boolean isOn;

    public Lightbulb(int wattage, String type, boolean isOn) {
        this.wattage = wattage;
        this.type = type;
        this.isOn = isOn;
    }

    public void turnOn() {
        System.out.println("Turning on the lightbulb");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Turning off the lightbulb");
        isOn = false;
    }
}

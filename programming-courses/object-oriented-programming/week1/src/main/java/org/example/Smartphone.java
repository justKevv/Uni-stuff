package org.example;

public class Smartphone {
    private String brand;
    private String operatingSystem;
    private int storage;
    private int camera;

    public Smartphone(String brand, String operatingSystem, int storage, int camera) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.camera = camera;
    }

    public void makeCall(String number) {
        System.out.println("Making call to " + number);
    }

    public void sendText(String message) {
        System.out.println("Sending text: " + message);
    }

    public void browseWeb(String url) {
        System.out.println("Browsing web at " + url);
    }
}

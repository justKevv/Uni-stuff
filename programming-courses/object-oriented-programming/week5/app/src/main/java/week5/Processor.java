package app.src.main.java.week5;

public class Processor {

    private String brand;
    private double cache;

    public Processor() {
        this.brand = "Intel";
        this.cache = 4.0;
    }

    public Processor(String brand, double cache) {
        this.brand = brand;
        this.cache = cache;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Brand Processor = %s\n", brand);
        System.out.printf("Cache = %.2f\n", cache);
    }
}

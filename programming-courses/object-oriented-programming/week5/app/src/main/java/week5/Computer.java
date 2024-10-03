package app.src.main.java.week5;

public class Computer {
    private String brand;
    private Processor processor;


    public Computer() {
        this.brand = "Intel";
        this.processor = new Processor();
    }

    public Computer(String brand, Processor processor) {
        this.brand = brand;
        this.processor = processor;
    }

    public void info() {
        System.out.println("Brand Computer = " + brand);
        processor.info();
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}

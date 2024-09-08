package week2.rentalgame;

public class Game {
    private int id;
    private String name;
    private float price_per_day;

    public Game(int id, String name, float price_per_day) {
        this.id = id;
        this.name = name;
        this.price_per_day = price_per_day;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice_per_day() {
        return price_per_day;
    }
}

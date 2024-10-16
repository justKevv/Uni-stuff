package week7;

public class Fish {
    public void swim() {
        System.out.println("Fish can swim");
    }
}

class Piranha extends Fish {
    @Override
    public void swim() {
        System.out.println("Piranha can eat meat");
    }
}

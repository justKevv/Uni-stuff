package week5.experiment3;

public class MainQuestion {
    public static void main(String[] args) {
        Employee machinist = new Employee("1234", "Spongebob Squarepants");
        Railway railway = new Railway("Gaya Baru", "Express", machinist);
        System.out.println(railway.info());

    }
}

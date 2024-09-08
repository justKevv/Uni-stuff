package week2.rentalgame;

public class Rental {

    private int id;
    private Member member;
    private Game game;
    private int rentDuration;

    public Rental(int id, Member member, Game game, int rentDuration) {
        this.id = id;
        this.member = member;
        this.game = game;
        this.rentDuration = rentDuration;
    }

    public double calculateTotalPrice() {
        return game.getPrice_per_day() * rentDuration;
    }

    public void displayRentalDetails() {
        System.out.println("Rental ID: " + id);
        System.out.println("Member Name: " + member.getName());
        System.out.println("Game Name: " + game.getName());
        System.out.println("Rent Duration: " + rentDuration + " days");
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}

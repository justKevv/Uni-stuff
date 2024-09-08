package week2.rentalgame;

public class Main {
    public static void main(String[] args) {
        // Create a member
        Member member = new Member(1, "John Doe");

        // Create a game
        Game game = new Game(101, "The Legend of Zelda", (float) 5.0);

        // Create a rental with a duration of 3 days
        Rental rental = new Rental(1001, member, game, 3);

        // Display the rental details
        rental.displayRentalDetails();
    }
}

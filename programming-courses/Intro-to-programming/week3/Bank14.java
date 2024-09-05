package week3;
import java.util.Scanner;
public class Bank14 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int init_sav_amount, sav_period;
            double final_sav_amount, interest, interest_rate = 0.02;

            System.out.print("Enter initial saving amount: ");
            init_sav_amount = in.nextInt();
            System.out.print("Enter saving period: ");
            sav_period = in.nextInt();

            interest = sav_period * interest_rate * init_sav_amount;
            final_sav_amount = init_sav_amount + interest;

            System.out.println("Interest: " + interest);
            System.out.println("Final saving amount: " + final_sav_amount);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

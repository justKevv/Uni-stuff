package week4;
import java.util.Scanner;
public class Experiment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price, quantity;
        double discount  = 0.1, totalPrice, purchasePrice, totalDiscount;

        System.out.print("Input price : ");
        price = scanner.nextInt();
        System.out.print("Input quantity : ");
        quantity = scanner.nextInt();

        totalPrice = price * quantity;

        totalDiscount = totalPrice *discount;
        purchasePrice = totalPrice - totalDiscount;


        System.out.println("Total Discount is " + totalDiscount);
        System.out.println("Your Price is "+purchasePrice);
    }
}

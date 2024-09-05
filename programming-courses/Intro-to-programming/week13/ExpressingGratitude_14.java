package week13;

import java.util.Scanner;

public class ExpressingGratitude_14 {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " May the force be with you!");
    }

    public static void sayAdditionalThankyou(String greeting) {
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        sayThankyou();
        String expression = "Thankyou...wish you all the best!!";
        sayAdditionalThankyou(expression);
    }
}

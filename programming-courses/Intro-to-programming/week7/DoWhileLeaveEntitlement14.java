package week7;

import java.util.Scanner;

public class DoWhileLeaveEntitlement14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Leave Entitlement = ");
        leaveEntitlement = sc.nextInt();

        do {
            System.out.print("Do you want to take leave? (Yes/No) ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("yes")) {
                System.out.print("Total Leave : ");
                numLeave = sc.nextInt();

                //added error numLeave greater than leaveEntitlement
                do {
                    System.out.println("Your Total Leave is greater than your Leave Entitlement.");
                    System.out.print("Total Leave : ");
                    numLeave = sc.nextInt();
                    
                } while (numLeave > leaveEntitlement);

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Leave Entitlement left = " + leaveEntitlement);
                } else {
                    System.out.println("Your Leave Entitlement is not enough to take this leave.");
                    break;
                }
                //Added break statement
            } else {
                break;
            }
        } while (leaveEntitlement > 0);
    }
}

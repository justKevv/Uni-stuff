package week3;
import java.util.Scanner;
public class Voltage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1, r2, r3, r4, resTotal,volt, intensity;

        System.out.print("Enter the resistance of the first resistor: ");
        r1 = sc.nextDouble();
        System.out.print("Enter the resistance of the second resistor: ");
        r2 = sc.nextDouble();
        System.out.print("Enter the resistance of the third resistor: ");
        r3 = sc.nextDouble();
        System.out.print("Enter the resistance of the fourth resistor: ");
        r4 = sc.nextDouble();
        resTotal = (1/r1) + (1/r2) + (1/r3) + r4;
        
        System.out.print("Enter the intensity of the current: ");
        intensity = sc.nextDouble();
        volt = resTotal * intensity;

        System.out.println();
        System.out.println("The voltage is: " + volt);

        

        
        


    }
}

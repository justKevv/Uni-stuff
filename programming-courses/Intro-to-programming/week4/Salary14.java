package week4;
import java.util.Scanner;
public class Salary14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAttendances, numAbsences, totalSalary;

        int salary, salaryDeduction;

        System.out.print("Input attendance number : ");
        numAttendances = scanner.nextInt();
        System.out.print("Input absence number : ");
        numAbsences = scanner.nextInt();
        System.out.print("Input salary : ");
        salary = scanner.nextInt();
        System.out.print("Input salary deduction : ");
        salaryDeduction = scanner.nextInt();
        totalSalary = numAttendances * salary - numAbsences * salaryDeduction;
        System.out.println("Total salary : " + totalSalary);
    }
}

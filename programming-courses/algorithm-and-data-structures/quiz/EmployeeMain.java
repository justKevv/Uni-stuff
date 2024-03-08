package quiz;

import java.util.Scanner;

/**
 * Quiz
 */
public class EmployeeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees do you have?: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.print("Name: ");
            employees[i].name = sc.nextLine();
            System.out.print("Age: ");
            employees[i].age = sc.nextInt();
            sc.nextLine();
            System.out.print("Living Allowence(per month): ");
            employees[i].livingAllowence = sc.nextInt();
            sc.nextLine();
            System.out.print("Transportation Allowence(per month): ");
            employees[i].transportationAllowance = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < employees[i].salary.length; j++) {
                System.out.print("Salary " + (j + 1) + ": ");
                employees[i].salary[j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.println("WELCOME TO EMPLOYEE SYSTEM");
        System.out.println("+-------------------------+");
        System.out.println("1. Print Data");
        System.out.println("2. Total Salary");
        System.out.println("3. Average Salary");
        System.out.println("4. Biggest allowance of 35-50 years old employee");
        System.out.println("5. Biggest allowance");
        System.out.println("+-------------------------+");
        System.out.println("--> ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < employees.length; i++) {
                    employees[i].printData(employees);
                }
                break;
            case 2:
                for (int i = 0; i < employees.length; i++) {
                    System.out.println(employees[i].name + " salary's: " + employees[i].totalSalary(employees));
                }
                break;
            case 3:
                System.out.println("1. All employees");
                System.out.println("2. Age is more than 35");
                System.out.print("--> ");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        Employee average = new Employee();
                        System.out.println("All employee average salary: " + average.averageSalary(employees));
                        break;
                    case 2:
                        double total = 0;
                        int count = 0;
                        for (int i = 0; i < employees.length; i++) {
                            if (employees[i].age > 35) {
                                total+= employees[i].totalSalary(employees);
                                count++;
                            }
                        }
                        if (count > 1) {
                            System.out.println("Average salary of employees age more than 35: " + total / count);
                        } else {
                            System.out.println("Average salary of employees age more than 35: " + total / employees[0].salary.length);
                        }
                        break;

                    default:
                        break;
                }
                break;

            case 4: 
               int big =  0;
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i].age > 35 && employees[i].age < 50) {
                        big = employees[i].livingAllowence + employees[i].transportationAllowance;
                        System.out.println("Biggest allowance of 35-50 years old employee is "+employees[i].name + ": " + big);
                        break;
                    }
                }
                break;
            case 5:
                int max = 0;
                int code = 0;
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i].livingAllowence + employees[i].transportationAllowance > max) {
                        max = employees[i].livingAllowence + employees[i].transportationAllowance;
                        code = i;
                    }
                }
                
                System.out.println("Biggest allowance is "+employees[code].name+": " + max);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
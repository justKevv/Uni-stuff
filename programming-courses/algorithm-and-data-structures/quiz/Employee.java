package quiz;

public class Employee {
    String name;
    int age, livingAllowence, transportationAllowance;
    int[] salary = new int[3];

    double averageSalary(Employee[] employees) {
        int average = 0;
        for (int i = 0; i < employees.length; i++) {
            average += employees[i].totalSalary(employees);
        }
        return average / employees.length;
    }

    double totalSalary(Employee[] employees) {
        double total = 0;

        for (int i = 0; i < salary.length; i++) {
            total += salary[i];
        }

        return total;
    }

    void printData(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("EMPLOYEE " + (i + 1));
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Living Allowence: " + livingAllowence);
            System.out.println("Transportation Allowence: " + transportationAllowance);
            System.out.println("+-------------------------------------------------+");
            for (int j = 0; i < salary.length; j++) {
                System.out.println("Salary " + (j + 1) + ": " + salary[j]);
            }
            System.out.println("+-------------------------------------------------+");
        }

    }

}

package week10;

import week10.interfaces.Payable;

public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + (salary * 0.05));
    }
}

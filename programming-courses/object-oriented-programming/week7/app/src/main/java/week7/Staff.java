package week7;

public class Staff extends Employee {
    private int overtimeHours;
    private double overtimePay;

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public double getSalary(int overtimeHours, double overtimePay) {
        return super.getSalary() + overtimeHours * overtimePay;
    }

    public double getSalary() {
        return super.getSalary() + (overtimeHours * overtimePay);
    }

    public void showInfo() {
        System.out.println("NIP :" + this.getNip());
        System.out.println("Name :" + this.getName());
        System.out.println("Group :" + this.getLevel());
        System.out.println("Overtime :" + this.getOvertimeHours());
        System.out.printf("Overtime Pay :%.0f\n", this.getOvertimePay());
        System.out.printf("Salary :%.0f\n", this.getSalary());
    }

}

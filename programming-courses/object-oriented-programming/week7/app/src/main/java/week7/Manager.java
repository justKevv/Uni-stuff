package week7;

public class Manager extends Employee {
    private double allowance;
    private String department;
    private Staff staff[];

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Staff[] getStaff() {
        return staff;
    }

    public void setStaff(Staff[] staff) {
        this.staff = staff;
    }

    public double getSalary() {
        return super.getSalary() + allowance;
    }

    public void showInfo() {
        System.out.println("Manager :" + this.getDepartment());
        System.out.println("NIP :" + this.getNip());
        System.out.println("Name :" + this.getName());
        System.out.println("Group :" + this.getLevel());
        System.out.printf("Allowance :%.0f\n", this.getAllowance());
        System.out.printf("Salary :%.0f\n", this.getSalary());
        System.out.println("Department :" + this.getDepartment());
    }

}

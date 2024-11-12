package week10;

public class IntershipEmployee extends Employee{
    private int length;

    public IntershipEmployee(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        info += "Registered as intership employee for " + length + " months/s\n";
        return info;
    }
}

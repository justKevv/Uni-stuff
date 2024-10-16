package week7;

public class Employee {
    private String name;
    private String nip;
    private String level;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;

        switch (level.charAt(0)) {
            case '1':
                this.salary = 5_000_000;
                break;
            case '2':
                this.salary = 3_000_000;
                break;
            case '3':
                this.salary = 2_000_000;
                break;
            case '4':
                this.salary = 1_000_000;
                break;
            case '5':
                this.salary = 750_000;
                break;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

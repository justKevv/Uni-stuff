package week5.experiment3;

public class Employee {
    private String identityNumber;
    private String name;

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Employee(String identityNumber, String name) {
        this.identityNumber = identityNumber;
        this.name = name;
    }

    public String info() {
        String info = "";
        info += "Identity Number: " + this.identityNumber + "\n";
        info += "Name: " + this.name;
        return info;
    }


}

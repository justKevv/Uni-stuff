package app.src.main.java.week3;

public class Member {
    private String name;
    private String address;
    private float deposit;

    Member(String name, String address) {
        this.name = name;
        this.address = address;
        this.deposit = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getDeposit() {
        return deposit;
    }

    public void deposit(float amount) {
        deposit += amount;
    }

    public void loan(float amount) {
        deposit -= amount;
    }

}

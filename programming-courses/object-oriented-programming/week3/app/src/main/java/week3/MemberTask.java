package app.src.main.java.week3;

public class MemberTask {
    private String ktpNumber;
    private String name;
    private int loanLimit;
    private int loanAmount;

    public MemberTask(String ktpNumber, String name, int loanLimit) {
        this.ktpNumber = ktpNumber;
        this.name = name;
        this.loanLimit = loanLimit;
        this.loanAmount = 0;
    }

    public void borrow(int amount) {
        if (amount + loanAmount <= loanLimit) {
            loanAmount += amount;
        } else {
            System.out.println("Loan exceeds the limit!");
        }
    }

    public void installments(int amount) {
        int minInstallment = (int) (loanAmount * 0.1);
        if (amount >= minInstallment) {
            loanAmount -= amount;
        } else {
            System.out.println("Sorry, installments must be 10% of the loan amount");
        }
    }

    public String getName() {
        return name;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }
}

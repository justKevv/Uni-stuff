package uts;

public class Account {
    private String accountNumber, accountName, phoneNumber, emailAddress;
    private int balance;

    /** Constructs an Account object. */
    public Account(String accountNumber, String accountName, String phoneNumber, String emailAddress, int balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.balance = balance;
    }

    /** Returns the account number. */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** Returns the account name. */
    public String getAccountName() {
        return accountName;
    }

    /** Returns the phone number. */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** Returns the email address. */
    public String getEmailAddress() {
        return emailAddress;
    }

    /** Returns the balance. */
    public int getBalance() {
        return balance;
    }

    /** Sets the balance of the account. */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /** Returns a string representation of the account. */
    @Override
    public String toString() {
        return String.format("%-10s | %-10s | %-20s | %-40s | %d", accountNumber, accountName, phoneNumber, emailAddress, balance);
    }
}
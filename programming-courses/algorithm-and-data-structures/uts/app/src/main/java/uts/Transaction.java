package uts;

public class Transaction {

    Account[] accounts = new Account[12];

    /** Adds an account to the transaction. */
    void addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                break;
            }
        }
    }

    /** Displays all accounts in the transaction. */
    void displayAccounts() {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    /** Sorts the accounts in the transaction based on their balance. */
    void sortAccounts() {
        int n = accounts.length;
        for (int i = 0; i < n; i++) {
            int large = i;
            for (int j = i + 1; j < n; j++) {
                if (accounts[j].getBalance() > accounts[large].getBalance()) {
                    large = j;
                }
            }
            Account temp = accounts[i];
            accounts[i] = accounts[large];
            accounts[large] = temp;
        }
    }

    /** Displays all accounts with zero balance in the transaction. */
    void displayZeroBalance() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getBalance() == 0) {
                System.out.println(accounts[i].toString());
            }
        }
    }

    /** Withdraws the specified amount from the account with the given account number in the transaction. */
    void withdrawAccounts(String accountNumber, int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].setBalance(accounts[i].getBalance() - amount);
                break;
            }
        }
    }

    /** Searches for an account with the given account name in the transaction. */
    void searchAccounts(String accountName) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountName().equals(accountName)) {
                System.out.println(accounts[i].toString());
                break;
            }
        }
    }

    /** Deposits the specified amount into the account with the given account number in the transaction. */
    void depositAccounts(String accountNumber, int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].setBalance(accounts[i].getBalance() + amount);
                break;
            }
        }
    }
}
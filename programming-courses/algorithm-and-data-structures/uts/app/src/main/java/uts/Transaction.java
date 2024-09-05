package uts;

import java.util.*;

public class Transaction {
    List<Account> accountsList = new ArrayList<Account>();

    /** Adds an account to the transaction. */
    void addAccount(Account account) {
        accountsList.add(account);
    }

    /** Displays all accounts in the transaction. */
    void displayAccounts() {
        for (int i = 0; i < accountsList.size(); i++) {
            System.out.println(accountsList.get(i).toString());
        }
    }

    /** Sorts the accounts in the transaction based on their balance. */
    void sortAccounts() {
        int n = accountsList.size();
        for (int i = 0; i < n; i++) {
            int large = i;
            for (int j = i + 1; j < n; j++) {
                if (accountsList.get(j).getBalance() > accountsList.get(large).getBalance()) {
                    large = j;
                }
            }
            Account temp = accountsList.get(i);
            accountsList.set(i, accountsList.get(large));
            accountsList.set(large, temp);
        }
    }

    /** Displays all accounts with zero balance in the transaction. */
    void displayZeroBalance() {
        for (int i = 0; i < accountsList.size(); i++) {
            if (accountsList.get(i).getBalance() == 0) {
                System.out.println(accountsList.get(i).toString());
            }
        }
    }

    /** Withdraws the specified amount from the account with the given account number in the transaction. */
    void withdrawAccounts(String accountNumber, int amount) {
        for (int i = 0; i < accountsList.size(); i++) {
            if (accountsList.get(i).getAccountNumber().equals(accountNumber)) {
                accountsList.get(i).setBalance(accountsList.get(i).getBalance() - amount);
                break;
            }
        }
    }

    /** Searches for an account with the given account name in the transaction. */
    void searchAccounts(String accountName) {
        for (int i = 0; i < accountsList.size(); i++) {
            if (accountsList.get(i).getAccountName().equals(accountName)) {
                System.out.println(accountsList.get(i).toString());
            }
        }
    }

    /**
     * Deposits the specified amount into the account with the given account number
     * in the transaction.
     */
    void depositAccounts(String accountNumber, int amount) {
        for (int i = 0; i < accountsList.size(); i++) {
            if (accountsList.get(i).getAccountNumber().equals(accountNumber)) {
                accountsList.get(i).setBalance(accountsList.get(i).getBalance() + amount);
                break;
            }
        }

    }

}
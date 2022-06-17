package OverlappingEnvelope;

import OverlappingEnvelope.Entities.Account;
import OverlappingEnvelope.Entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(656, "Wind", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(556, "Dantxal", 1000.0, 0.1);
    }
}

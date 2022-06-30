package ExerciseException;

import ExerciseException.Entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number of account: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        Double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > acc.getWithdrawLimit()) {
            System.out.println("Withdraw error: The amount exceeds the withdrawal limit");
        }   else if (amount > acc.getBalance()) {
            System.out.println("withdraw error: Insuficient amount");
        }   else {
            acc.withdraw(amount);
            System.out.printf("New amount: %.2f%n", acc.getBalance());
        }

    }
}

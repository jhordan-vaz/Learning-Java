package ExerciseAbstract;

import ExerciseAbstract.Entities.Company;
import ExerciseAbstract.Entities.Individual;
import ExerciseAbstract.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer # " + i + "data:");
            System.out.print("Individual or company? ");
            char ch = scanner.next().charAt(0);
            System.out.println("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Anual income: ");
            double income = scanner.nextDouble();
            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                double healthexpenditures = scanner.nextDouble();
                list.add(new Individual(name, income, healthexpenditures));
            } else {
                System.out.println("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                list.add(new Company(name, income, numberOfEmployees));
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("Taxes Paid: ");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("Total Taxes $" + String.format("%.2f", sum));
    }
}

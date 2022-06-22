package Polymorphism;

import Polymorphism.Entities.Employee;
import Polymorphism.Entities.OutSorcerdEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsorced (y/n)?");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if (ch == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                Employee emp = new OutSorcerdEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

        }

        System.out.println();
        System.out.println("Payments:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }
    }
}

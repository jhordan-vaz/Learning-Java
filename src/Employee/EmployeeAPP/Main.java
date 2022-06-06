package Employee.EmployeeAPP;

import Employee.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = scanner.nextLine();
        System.out.println("Gross Salary: ");
        emp.grossSalary = scanner.nextInt();
        System.out.println("Tax: ");
        emp.tax = scanner.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Whichj percent to increase salary? ");
        double percentage = scanner.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);


    }
}

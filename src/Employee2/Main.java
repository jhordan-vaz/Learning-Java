package Employee2;

import Employee2.Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employess will be registered? ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            System.out.println("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Salary: ");
            Double salary = scanner.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increse: ");
        int idsalary = scanner.nextInt();
        Integer pos = position(list, idsalary);
        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter the percentage: ");
            double percent = scanner.nextDouble();
            list.get(pos).increseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
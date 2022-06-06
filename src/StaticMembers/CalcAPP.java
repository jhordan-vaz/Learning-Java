package StaticMembers;

import StaticMembers.util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class CalcAPP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter Radius: ");
        double radius = scanner.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);
    }
}

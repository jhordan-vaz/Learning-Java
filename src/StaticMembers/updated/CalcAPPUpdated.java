package StaticMembers.updated;

import StaticMembers.updated.Calculator.obj;

import java.util.Locale;
import java.util.Scanner;

public class CalcAPPUpdated {
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = obj.circumference(radius);

        double v = obj.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n",PI);

    }
}

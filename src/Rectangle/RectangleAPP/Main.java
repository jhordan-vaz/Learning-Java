package Rectangle.RectangleAPP;

import Rectangle.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle widht and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("Area = %.2f%n", rectangle.Area());
        System.out.printf("Perimeter = %.2f%n", rectangle.Perimeter());
        System.out.printf("Diagonal = %.2f%n", rectangle.Diagonal());


    }
}

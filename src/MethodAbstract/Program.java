package MethodAbstract;

import MethodAbstract.Entities.Circle;
import MethodAbstract.Entities.Color;
import MethodAbstract.Entities.Rectangle;
import MethodAbstract.Entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.println("Rectange or Circle (r/c)? ");
            char ch = scanner.next().charAt(0);
            System.out.println("Color (Black/Blue/Red): ");
            Color color = Color.valueOf(scanner.next());
            if (ch == 'r') {
                System.out.print("Widht:");
                double width = scanner.nextDouble();
                System.out.println("Height: ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("Shape areas: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}

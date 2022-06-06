package Triangle.TriangleAPP;

import Triangle.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Importe do metodo/objeto
        Triangle x, y;
        //Novas variáveis
        x = new Triangle();
        y = new Triangle();

        //Recebimento de dados para os lados
        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        //Condição booleana sobre as areas X e Y
        if (areaX > areaY){
            System.out.println("Larger area X");
        }
        else {
            System.out.println("Larger area Y");
        }
    }
}

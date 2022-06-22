package ExercisePolymorphism;

import ExercisePolymorphism.Entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)  {
            System.out.println("Product #" + i + "data: ");
            System.out.println();
        }


    }
}

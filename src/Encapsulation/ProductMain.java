package Encapsulation;

import Constructor.Entities.Product;
import Encapsulation.Entities.ProductObj;

import java.util.Locale;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        Double price = scanner.nextDouble();
        ProductObj product = new ProductObj(name, price);

        product.setName(scanner.nextLine());
        System.out.println("Updated name: " + product.getName());
        product.setPrice(scanner.nextDouble());
        System.out.println("Updated price: " + product.getPrice());


        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

    }
}

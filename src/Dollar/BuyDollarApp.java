package Dollar;

import java.util.Locale;
import java.util.Scanner;

public class BuyDollarApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        converter.price = scanner.nextDouble();
        System.out.printf("%.2f", converter.price);
        System.out.println();

        System.out.println("How many dollars will be bought? ");
        converter.dollar = scanner.nextDouble();
        System.out.printf("%.2f",converter.dollar);
        System.out.println();

        System.out.println("Amount to be paid in reais = " + converter.dollarTax());



    }
}
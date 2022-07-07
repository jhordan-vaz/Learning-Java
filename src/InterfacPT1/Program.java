package InterfacPT1;

import InterfacPT1.Entitites.CarRental;
import InterfacPT1.Entitites.Vehicle;
import InterfacPT1.Entitites.services.RentalService;
import InterfacPT1.Entitites.services.ServiceTax;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rental data: ");
        System.out.println("Car model: ");
        String carModel = scanner.nextLine();
        System.out.printf("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(scanner.nextLine());
        System.out.printf("Return (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(scanner.nextLine());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rs = new RentalService(pricePerDay,pricePerHour, new ServiceTax());

        rs.processInvoice(cr);

        System.out.println("Invoice: ");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
    }
}

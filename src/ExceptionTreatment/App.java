package ExceptionTreatment;

import ExceptionTreatment.Model.AppExceptions;
import ExceptionTreatment.Model.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Enter the room number: ");
            int number = scanner.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scanner.next());
            System.out.print("Chek-out date (dd/MM/yyyy): ");
            Date chekOut = sdf.parse(scanner.next());

            Reservation reservation = new Reservation(number, checkIn, chekOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in update (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());
            System.out.print("Chek-out update (dd/MM/yyyy): ");
            chekOut = sdf.parse(scanner.next());

            reservation.updateDates(checkIn, chekOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format ");
        } catch (AppExceptions e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
    }
}

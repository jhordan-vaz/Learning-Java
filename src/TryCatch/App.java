package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        } catch (InputMismatchException e) {
            System.out.println("Type a number!");
        }
        System.out.println("End of program!");
    }
}

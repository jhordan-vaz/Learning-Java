package BlockFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        File file = new File("C:\\teste\\test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (scanner != null) {
                System.out.println("Test!");
            }
        }
    }
}

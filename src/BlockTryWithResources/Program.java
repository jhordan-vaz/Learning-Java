package BlockTryWithResources;

//Block try declarate one or more resources'll be closed at the end.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\teste\\test.txt";

        //instantiating Br and Fr don't need create var's.
        //The code is more clean and less polluted.

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


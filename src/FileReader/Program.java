package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\teste\\test.txt";
        FileReader fr = null;
        BufferedReader br = null;

        // Bad solution. Created var's and all the solution in main program.

        try {
            fr = new FileReader(path); // A reader of files in HD directory.
            br = new BufferedReader(fr); // Reader that's read faster and clean than FileReader.

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

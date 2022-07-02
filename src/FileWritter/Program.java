package FileWritter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", " Good afternoon", "Good night"};

        String path = "C:\\Users\\jhord\\OneDrive\\Área de Trabalho\\teste.txt";

        // if don't want to destroy the file and just overwrite it, just put "true" as append.

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


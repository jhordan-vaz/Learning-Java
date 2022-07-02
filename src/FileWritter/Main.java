package FileWritter;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        //isDirectory is to specify to list only directories or folders in choosed path.
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //isFile write the files in the directory or folder.
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES  ");
        for (File file : files) {
            System.out.println(files);
        }

        //mkdir create a directory in selected path.
        boolean success = new File(strPath + "\\Area de trabalho").mkdir();
        System.out.println("Directory created successfully: " + success);

    }
}

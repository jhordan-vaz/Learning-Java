package FileWritter;

import java.io.File;
import java.util.Scanner;

public class AppFileInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        // getName just get the name of file and don't say the directory.
        System.out.println("getName:" + path.getName());
        //getParent just get the path, ignoring files.
        System.out.println("getParent:" + path.getParent());
        // getPath get Path with files names and directory.
        System.out.println("getParent:" + path.getPath());
    }
}

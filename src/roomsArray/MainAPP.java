package roomsArray;

import roomsArray.Rooms.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class MainAPP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Rooms[] rooms = new Rooms[n];

        System.out.println("Type your name, email and room: ");
        for (int i = 0; i < rooms.length; i++) {
            scanner.nextInt();
            String name = scanner.nextLine();
            String email = scanner.nextLine();
            Double rent = scanner.nextDouble();
            rooms[i] = new Rooms(name, email, rent);
        }
        System.out.println("Busy rooms:" + rooms);

    }
}

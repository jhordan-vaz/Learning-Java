package Grade;

import Grade.GradeNotes.Grade;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Grade student = new Grade();

        student.name = scanner.nextLine();
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        System.out.printf("Final Grade: %.2fn", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("Missing %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

    }
 }


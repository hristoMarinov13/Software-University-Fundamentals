package MidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//49

        int students = Integer.parseInt(scanner.nextLine());
        double lectures = Double.parseDouble(scanner.nextLine());
        double additionalBonus = Double.parseDouble(scanner.nextLine());

        int maxBonus = 0;
        int maxAttendances = 0;


        for (int i = 0; i < students; i++) {

            double  studentAttendances = Double.parseDouble(scanner.nextLine());

            double studentBonus = (studentAttendances / lectures) * (5 + additionalBonus);

            if (studentBonus > maxBonus) {
                maxBonus = (int)Math.ceil(studentBonus);
                maxAttendances = (int)studentAttendances;
            }
        }

        System.out.printf("Max Bonus: %d.\n", maxBonus);
        System.out.printf("The student has attended %d lectures.\n", maxAttendances);


    }
}

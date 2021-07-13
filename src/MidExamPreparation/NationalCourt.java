package MidExamPreparation;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());

        int peopleHandled = firstEmployee + secondEmployee + thirdEmployee;
        // people per 1 hour

        int totalPeople = Integer.parseInt(scanner.nextLine());
        int hoursCounter = 0;

        while (totalPeople > 0){

            hoursCounter++;

            if (hoursCounter % 4 == 0){
                //break time
                hoursCounter++;
            }

            totalPeople -= peopleHandled;
        }

        System.out.printf("Time needed: %dh.", hoursCounter);

    }
}

package MidExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        String[] wagonsAsString = scanner.nextLine().split("\\s+");

        int[] liftCabins = new int[wagonsAsString.length];
        for (int i = 0; i < wagonsAsString.length; i++) {
            liftCabins[i] = Integer.parseInt(wagonsAsString[i]);
        }


        for (int i = 0; i < liftCabins.length; i++) {
            int peopleInCabin = liftCabins[i];
            int freeSpace = 4 - peopleInCabin;

            if (peopleInCabin >=4){
                continue;
            }

            if (freeSpace >= peopleInQueue){
                liftCabins[i] = liftCabins[i] + peopleInQueue;
                peopleInQueue = 0;
                break;
            }else{
                liftCabins[i] = 4;
                peopleInQueue -= freeSpace;
            }
        }

        if (peopleInQueue == 0){
            System.out.println("The lift has empty spots!");
        }else {
            System.out.printf("There isn't enough space! %d people in a queue! %n", peopleInQueue);
        }

        for (int i = 0 ; i < liftCabins.length ; i++) {
            System.out.printf("%d ", liftCabins[i]);
        }
    }
}

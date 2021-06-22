package Arrays;

import java.util.Scanner;

public class Trains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[n];
        int sumOfPassengers = 0;

        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int w : wagons){
            System.out.printf("%d ", w);
            sumOfPassengers += w;
        }

        System.out.printf("\n");
        System.out.printf("%d \n", sumOfPassengers);
    }
}

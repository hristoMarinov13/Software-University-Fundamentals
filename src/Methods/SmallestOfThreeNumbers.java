package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        printSmallest(arr);
    }

    public static void printSmallest(int [] arr) {

        int smallestInt = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < smallestInt){
                smallestInt = i;
            }
        }

        System.out.println(smallestInt);
    }

}

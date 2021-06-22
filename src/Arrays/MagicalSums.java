package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1 ; j < arr.length; j++) {

                if (arr[i] + arr[j] == n){
                    System.out.printf("%d %d \n", arr[i], arr[j]);
                }
            }
        }

    }
}

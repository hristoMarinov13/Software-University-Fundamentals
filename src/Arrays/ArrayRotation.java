package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int firstElement = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j +1];
            }

            arr[arr.length - 1] = firstElement;

        }


        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("%d " , arr[i]);
        }

    }
}

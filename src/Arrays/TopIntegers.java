package Arrays;

import java.util.Scanner;

public class TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            boolean isTop = true;

            for (int j = i; j < arr.length; j++) {
                if (currentElement < arr[j]){
                    isTop = false;
                }
            }

            if (isTop){
//                System.out.printf("%d " , currentElement);
                System.out.print(currentElement + " ");
            }
        }


    }
}

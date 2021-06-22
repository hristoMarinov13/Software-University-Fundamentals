package Arrays;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];


        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {//left sum
                leftSum += arr[j];
            }

            for (int j = i+1; j < arr.length; j++) {//right sum
                rightSum += arr[j];
            }

            if (leftSum == rightSum){
                System.out.printf("%d\n", i);
                break;
            }else if (i == (arr.length - 1)){
                System.out.print("no\n");
            }

        }


    }
}

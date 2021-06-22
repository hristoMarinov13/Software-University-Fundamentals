package Arrays;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];


        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int maxSequenceCount = 0;
        int maxSequenceElement = 0;

        int element = arr[0];
        int count = 1;


        for (int i = 1; i < arr.length; i++) {

            if (element == arr[i]){
                count++;

                if (count > maxSequenceCount){
                    maxSequenceCount = count;
                    maxSequenceElement = element;
                }

            }else{
                element = arr[i];
                count = 1;
            }
        }

        for (int i = 0; i < maxSequenceCount; i++) {
            System.out.print(maxSequenceElement + " ");
        }
    }
}

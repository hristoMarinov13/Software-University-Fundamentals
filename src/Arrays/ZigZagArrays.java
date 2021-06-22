package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] element = scanner.nextLine().split(" ");

            if (i % 2 == 0){
                firstArr[i] = Integer.parseInt(element[0]);
                secondArr[i] = Integer.parseInt(element[1]);
            }else{
                firstArr[i] = Integer.parseInt(element[1]);
                secondArr[i] = Integer.parseInt(element[0]);
            }
        }

        for (int s1 : firstArr){
            System.out.print(s1 + " ");
        }
        System.out.println();

        for (int s2 : secondArr){
            System.out.print(s2 + " ");
        }




    }
}

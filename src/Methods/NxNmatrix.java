package Methods;

import java.util.Scanner;

public class NxNmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNxNmatrix(n);
    }

    public static void printNxNmatrix(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", n);;
            }
            System.out.printf("\n");
        }
    }
}

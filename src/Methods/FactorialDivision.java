package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", calculateFactorialDivision(first, second));
    }

    public static double calculateFactorialDivision(int first, int second){

        int firstFactorial = 1;
        int secondFactorial = 1;


        while (first > 1){
            firstFactorial *= first;
            first--;
        }

        while (second > 1){
            secondFactorial *= second;
            second--;
        }

        return (double)firstFactorial / secondFactorial;
    }
}

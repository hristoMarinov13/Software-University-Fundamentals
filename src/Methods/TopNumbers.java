package Methods;

import java.util.Scanner;

public class TopNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printTopNumbers(number);
    }

    private static void printTopNumbers(int number) {

        for (int i = 17; i <= number ; i++) {
            if (isSumOfDigitsDivisibleByEight(i) && holdsOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean holdsOddDigit(int i) {
        while(i != 0){
            int lastDigit = i % 10;

            if (lastDigit % 2 != 0){
                return true;
            }

            i /= 10; // remove the last digit
        }

        return false;
    }

    private static boolean isSumOfDigitsDivisibleByEight(int i) {
        int sumOfDigits = 0;

        while(i != 0){
            sumOfDigits += i % 10;
            i /= 10; // remove the last digit
        }

        return sumOfDigits % 8 == 0;
    }
}

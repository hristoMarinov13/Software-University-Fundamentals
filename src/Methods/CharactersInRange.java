package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetterCode = scanner.nextLine().charAt(0);
        char secondLetterCode = scanner.nextLine().charAt(0);

        printCharactersInBetween(firstLetterCode, secondLetterCode);
    }

    public static void printCharactersInBetween(char first, char second){
        int smallerCode;
        int largerCode;

        if ((int)first > (int)second){
            smallerCode = (int)second;
            largerCode = (int)first;
        }else{
            smallerCode = (int)first;
            largerCode = (int)second;
        }

        for (int i = smallerCode+1 ; i < largerCode ; i++){
            System.out.printf("%c ", (char)i );
        }

    }


}

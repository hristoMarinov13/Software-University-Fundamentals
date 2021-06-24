package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printMiddleCharacter(scanner.nextLine());
    }

    public static  void printMiddleCharacter(String str){

        if (str.length() % 2 == 0){
            System.out.printf("%c%c \n", str.charAt(str.length()/2  - 1), str.charAt(str.length()/2) );
        }else{
            System.out.printf("%c \n", str.charAt(str.length()/2));
        }

    }
}

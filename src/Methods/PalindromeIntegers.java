package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();


       while (!command.equals("END")){

           System.out.println(isPalindrome(command));;
           command = scanner.nextLine();
       }

    }

    private static boolean isPalindrome(String number){
        reverse(number);
        return number.equals(reverse(number));
    }

    private static String reverse(String s){
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }

}

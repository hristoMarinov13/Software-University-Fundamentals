package StringManipulation;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if(isValid(username)){
                System.out.println(username);
            }
        }
    }

    private static boolean isValid(String word){

        boolean isValid = false;

        if (word.length() >= 3 && word.length() <= 16){
            isValid = true;
        }else{
            return  false;
        }

        for (char symbol : word.toCharArray()) {
            if (Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_'){
                isValid = true;
            }
            else{
                return false;
            }
        }
        return isValid;
    }
}

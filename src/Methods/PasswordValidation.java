package Methods;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        checkPassword(scanner.nextLine());
    }

    public static void checkPassword(String strInput){

        boolean flag1 = check6To10Characters(strInput);
        boolean flag2 = checkLettersAndDigits(strInput);
        boolean flag3 = checkAtLeast2Digits(strInput);

        if (flag1 && flag2 && flag3){
            System.out.println("Password is valid");
        }

    }

    public static boolean check6To10Characters(String strInput){
        if (strInput.length() < 6 || strInput.length() > 10){
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    public static boolean checkLettersAndDigits(String strInput){
        boolean consistsOnlyLettersAndDigits = false;

        for (int i = 0; i < strInput.length(); i++) {
            
            int currChar = (int)strInput.charAt(i);
            if (currChar >= 48 && currChar <= 57
                    || currChar >= 65 && currChar <= 90
                    || currChar >= 97 && currChar <= 122){
                consistsOnlyLettersAndDigits = true;
            }else{
                consistsOnlyLettersAndDigits = false;
                break;
            }
        }

        if(!consistsOnlyLettersAndDigits){
            System.out.println("Password must consist only of letters and digits");
            return false;
        }
        return true;
    }

    public static boolean checkAtLeast2Digits(String strInput){

        int countDigits = 0;

        for (int i = 0; i < strInput.length(); i++) {
            if ((int)strInput.charAt(i) >= 48 && (int)strInput.charAt(i) <= 57){
                countDigits++;
            }
        }

        if (countDigits >= 2){
            return true;
        }

        System.out.println("Password must have at least 2 digits");
        return false;
    }
}

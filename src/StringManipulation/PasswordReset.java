package StringManipulation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String[] commandParts  = command.split("\\s+");

            switch(commandParts[0]){
                case "TakeOdd":

                    password = getOddIndexes(password);
                    System.out.println(password);

                    break;

                case "Cut":

                    int index = Integer.parseInt(commandParts[1]);
                    int length = Integer.parseInt(commandParts[2]);

                    String strToRemove = password.substring(index, index + length);
                    password = password.replaceFirst(strToRemove, "");

                    System.out.println(password);
                    break;

                case "Substitute":

                    String substring = commandParts[1];
                    String substitution = commandParts[2];

                    if (password.contains(substring)){
                        password = password.replaceAll(substring, substitution);
                        System.out.println(password);
                    }
                    else{
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }

    private static String getOddIndexes(String password){
        StringBuilder newPassword = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            if (i % 2 == 1){
                newPassword.append(password.charAt(i));
            }
        }

        return newPassword.toString();
    }

}

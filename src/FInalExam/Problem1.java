package FInalExam;

import java.util.Locale;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        //final_exam

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder(input);
        String instruction = scanner.nextLine();

        while (!instruction.equals("End")) {

            String[] command = instruction.split("\\s+");

            switch (command[0]) {

                case "Translate":
                    String ch = command[1];
                    String replacement = command[2];

                    String tempRes = result.toString();
                    tempRes = tempRes.replaceAll(ch, replacement);
                    result.setLength(0);
                    result = new StringBuilder(tempRes);

                    System.out.println(result.toString());

                    break;

                case "Includes":

                    String str = command[1];
                    tempRes = result.toString();

                    if (tempRes.contains(str)){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }

                    break;

                case "Start":

                    str = command[1];

                    if (result.indexOf(str) == 0){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }

                    break;

                case "Lowercase":

                    tempRes = result.toString();
                    tempRes = tempRes.toLowerCase(Locale.ROOT);
                    result.setLength(0);
                    result = new StringBuilder(tempRes);

                    System.out.println(result.toString());

                    break;

                case "FindIndex":

                    ch = command[1];
                    int index = result.lastIndexOf(ch);

                    System.out.println(index);

                    break;

                case "Remove":

                    int startIndex = Integer.parseInt(command[1]);
                    int count = Integer.parseInt(command[2]);

                    result.delete(startIndex, startIndex + count);

                    System.out.println(result.toString());

                    break;
            }
            instruction = scanner.nextLine();
        }

    }
}

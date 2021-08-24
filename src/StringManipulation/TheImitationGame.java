package StringManipulation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder(input);
        String instruction = scanner.nextLine();

        while (!instruction.equals("Decode")) {

            String[] command = instruction.split("\\|");

            switch (command[0]) {

                case "Move":
                    int numberOfLetters = Integer.parseInt(command[1]);

                    String lettersToRemove = result.substring(0, numberOfLetters);

                    if (numberOfLetters > result.length()) {
                        numberOfLetters = result.length();
                    }

                    result.delete(0, numberOfLetters);
                    result.append(lettersToRemove);
                    break;

                case "Insert":
                    int index = Integer.parseInt(command[1]);

                    String valueToInsert = command[2];

                    result.insert(index, valueToInsert);
                    break;

                case "ChangeAll":
                    String substring = command[1];
                    String replacement = command[2];
                    String resultString = result.toString();

                    if (resultString.contains(substring)) {
                        resultString = resultString.replace(substring, replacement);

                        StringBuilder updatedResult = new StringBuilder();
                        updatedResult.append(resultString);
                        result = updatedResult;
                    }
                    break;
            }
            instruction = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", result);
    }
}

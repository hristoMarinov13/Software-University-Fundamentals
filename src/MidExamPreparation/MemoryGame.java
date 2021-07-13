package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {//35
        Scanner scanner = new Scanner(System.in);

        List<String> sequence  = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

//        List<String> sequence = new ArrayList<String>();
//
//        for (String s: scanner.nextLine().split("\\s+")) {
//            sequence.add(s);
//        }

        int moves = 0;
        String userInput = scanner.nextLine();

        while (!userInput.equals("end")){
            moves++;

            int[] userInputArray = Arrays.stream(userInput.split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            int firstIndex = userInputArray[0];
            int secondIndex = userInputArray[1];
            String firstNumber = sequence.get(firstIndex);
            String secondNumber = sequence.get(secondIndex);

            if (firstNumber.equals(secondNumber)){
                System.out.printf("Congrats! You have found matching elements - %s!%n", sequence.get(firstIndex));

                if (firstIndex < secondIndex){
                    sequence.remove(secondNumber);
                    sequence.remove(firstNumber);
                }else{
                    sequence.remove(firstNumber);
                    sequence.remove(secondNumber);
                }

            }else{
                System.out.println("Try again!");
            }


            //check for valid indexes and punish
            if (!isIndexValid(firstIndex, secondIndex, sequence, moves)){
                System.out.println("Invalid input! Adding additional elements to the board");
                userInput = scanner.nextLine();
                continue;
            }





            userInput = scanner.nextLine();
        }

        if (sequence.isEmpty()){
            System.out.printf("You have won in %d turns!%n", moves);
        }else{
            System.out.println("Sorry you lose :(");
            for (String s: sequence) {
                System.out.printf("%s ", s);;
            }
        }

    }

    private static boolean isIndexValid(int indexOne, int indexTwo, List<String> sequence, int moves) {

        if (indexOne == indexTwo
                || indexOne >= sequence.size() || indexOne < 0
                || indexTwo >= sequence.size() || indexTwo < 0){

            String penaltyElement = "-" + moves + "a";
            sequence.add(sequence.size() /2, penaltyElement);
            sequence.add(sequence.size() /2 + 1, penaltyElement);
            return false;
        }

        return true;
    }
}

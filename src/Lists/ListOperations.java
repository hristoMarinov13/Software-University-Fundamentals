package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")){
            Integer parseInt = Integer.parseInt(s);
            numbers.add(parseInt);
        }

        String command = scanner.nextLine();

        while(!command.equals("End")){
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];


            switch (commandName){
                case "Add":
                    int numberToAdd = Integer.parseInt(commandData[1]);
                    numbers.add(numberToAdd);
                    break;

                case "Insert":
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int index = Integer.parseInt(commandData[2]);

                    if(isValidIndex(index, numbers.size())){
                        numbers.add(index, numberToInsert);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    int removeIndex = Integer.parseInt(commandData[1]);

                    if(isValidIndex(removeIndex, numbers.size())){
                        numbers.remove(removeIndex);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":

                    String shiftType = commandData[1];
                    int count = Integer.parseInt(commandData[2]);
                    if (shiftType.equals("left")){
                        shiftLeft(numbers, count);
                    }else if (shiftType.equals("right")){
                        shiftRight(numbers, count);
                    }

            }
            command = scanner.nextLine();
        }

        for (int n : numbers) {
            System.out.printf("%d ", n);
        }


    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            //the last becomes first
            int lastElement = numbers.get(numbers.size() - 1);
            numbers.add(0, lastElement);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            //the first becomes last
            int firstElement = numbers.get(0);
            numbers.add(firstElement);
            numbers.remove(0);
        }
    }

    public static boolean isValidIndex(int index, int size){
        return index >= 0 && index <= size - 1;
    }
}

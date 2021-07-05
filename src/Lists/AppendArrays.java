package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrays = input.split("\\|");

        for (int index = arrays.length - 1; index >=0 ; index--) {
            String elements = arrays[index].trim();

            if (elements.equals(" ") || elements.equals("")){
                continue;
            }

            String[] numbers = elements.split("\\s+");

            for (String number : numbers){
                System.out.printf("%s ", number);
            }
        }
    }
}

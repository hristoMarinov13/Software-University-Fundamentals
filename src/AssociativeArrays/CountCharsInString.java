package AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int i = 0 ; i < text.length(); i++){
            char currSymbol = text.charAt(i);

            if (currSymbol == ' '){
                continue;
            }

            if (!lettersCount.containsKey(currSymbol)){

                lettersCount.put(currSymbol, 1);

            }else{

                int currCount = lettersCount.get(currSymbol);
                currCount++;
                lettersCount.put(currSymbol, currCount);
            }

        }

        lettersCount.entrySet().
                forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}

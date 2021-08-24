package RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {//21:05
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> items = new ArrayList<>();

        Pattern pattern = Pattern.compile("([#|])(?<name>[A-Za-z\\s]+)(\\1)(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})(\\1)(?<calories>[0-9]{1,5}+)(\\1)");
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;
        int days;

        while(matcher.find()){
            totalCalories += Integer.parseInt(matcher.group("calories"));
            String itemString =
                    "Item: " + matcher.group("name") +", Best before: " + matcher.group("expirationDate") + ", Nutrition: " + matcher.group("calories");

            items.add(itemString);
        }

        days = totalCalories / 2000;

        System.out.println("You have food to last you for: " + days + " days!");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}

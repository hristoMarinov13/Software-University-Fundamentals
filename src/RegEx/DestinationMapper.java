package RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([/=])(?<place>[A-Z][A-Za-z]{2,})(\\1)");
        Matcher matcher = pattern.matcher(input);

        int travelPoints = 0;
        List<String> destinations = new ArrayList<>();

        while (matcher.find()){
            travelPoints += matcher.group("place").length();
            destinations.add(matcher.group("place"));
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + travelPoints);

    }
}

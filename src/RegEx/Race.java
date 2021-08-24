package RegEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {//16:40

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] racers = scanner.nextLine().split(",\\s+");
        Map<String, Integer> racersDistances = new LinkedHashMap<>();

        for (int i = 0; i < racers.length; i++) {
            racersDistances.put(racers[i], 0);
        }

//        racers.forEach(racer -> racersDistances.put(racer, 0));

        String regexLetter = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexLetter);

        String regexNumber = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexNumber);

        String input = scanner.nextLine();

        while (!input.equals("end of race")){
            Matcher matcherName = patternName.matcher(input);
            Matcher matcherDistance = patternDistance.matcher(input);

            StringBuilder name =new StringBuilder();
            while (matcherName.find()){
                name.append(matcherName.group());
            }

            int distance = 0;
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }

            if (racersDistances.containsKey(name.toString())) {
                int currentDistance = racersDistances.get(name.toString());
                racersDistances.put(name.toString(), currentDistance + distance);
            }

            input = scanner.nextLine();
        }


        List<String> firstThreeNames = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))//sorted by value map
                .limit(3)
                .map(entry -> entry.getKey())//get keys only
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThreeNames.get(0));
        System.out.println("2nd place: " + firstThreeNames.get(1));
        System.out.println("3rd place: " + firstThreeNames.get(2));
    }
}

package RegEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        Pattern p = Pattern.compile("[starSTAR]");
        Matcher m;

        Pattern pattern = Pattern.compile("\\@(?<planetName>[A-Za-z]+)[^-@!:>]*\\:(?<population>[0-9]+)[^-@!:>]*\\!(?<attack>[AD])[^-@!:>]*\\![^-@!:>]*\\->(?<soldierCount>[0-9]+)[^-@!:>]*");
        Matcher matcher;

        for (int i = 0; i < n; i++) {
            String encryptedMessage = scanner.nextLine();
            int decryptionKey = 0;
            m = p.matcher(encryptedMessage);

            while (m.find()){
                decryptionKey++;
            }

            StringBuilder decryptedMessage = new StringBuilder();

            for (int j = 0; j < encryptedMessage.length(); j++) {
                int code = (int)encryptedMessage.charAt(j);
                code -= decryptionKey;
                decryptedMessage.append ((char)(code));
            }

//            System.out.println(decryptedMessage.toString());

            matcher = pattern.matcher(decryptedMessage.toString());

            if (matcher.find()){
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attack = matcher.group("attack");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attack.equals("A")){
                    attacked.add(planetName);
                }
                else if (attack.equals("D")){
                    destroyed.add(planetName);
                }

//                System.out.println(planetName);
//                System.out.println(population);
//                System.out.println(attack);
//                System.out.println(soldierCount);
            }
        }

        System.out.println("Attacked planets: " + attacked.size());
        attacked = attacked.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        if (attacked.size() > 0){
            for (String s: attacked) {
                System.out.println("-> " + s);
            }
        }

        System.out.println("Destroyed planets: " + destroyed.size());
        destroyed = destroyed.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        if (destroyed.size() > 0){
            for (String s: destroyed) {
                System.out.println("-> " + s);
            }
        }
    }
}

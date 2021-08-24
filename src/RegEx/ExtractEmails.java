package RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<String> emails = new ArrayList<>();

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\s+(?<user>[a-z0-9]+[\\.\\-\\_]?[a-z0-9]*)@(?<host>[a-z]+\\-?[a-z]*\\.[a-z]*\\.?[a-z]*\\-?[a-z])");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            String email = matcher.group().trim();

            String lastChar = "" + email.charAt(email.length() - 1);
            if (lastChar.equals(".")){

            }

            System.out.println(email);
        }
    }
}

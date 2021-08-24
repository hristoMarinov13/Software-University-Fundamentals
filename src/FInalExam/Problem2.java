package FInalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        Pattern pattern = Pattern.compile("[U][$](?<username>[A-Z][a-z]{2,})[U][$][P][@][$](?<password>[A-Za-z]{5,}[0-9]+)[P][@][$]");

        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());

            if (matcher.find()){
                counter++;
                String username = matcher.group("username");
                String password = matcher.group("password");

                System.out.println("Registration was successful");
                System.out.println("Username: " + username + ", Password: " + password);

            }
            else{
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + counter);
    }
}

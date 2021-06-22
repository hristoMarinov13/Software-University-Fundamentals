package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String s2 : secondArr) {
            for (String s1 : firstArr) {
                if (s1.equals(s2)) {
                    System.out.printf("%s ", s2);
                }
            }
        }
    }
}
package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().toLowerCase().split("");

        countVowels(arr);

    }

    public static void countVowels(String arr[]){
        int count =0;

        for (String i : arr) {
            if (i.equals("a") || i.equals("e") || i.equals("i") || i.equals("o") || i.equals("u")){
                count++;
            }
        }

        System.out.println(count);
    }
}

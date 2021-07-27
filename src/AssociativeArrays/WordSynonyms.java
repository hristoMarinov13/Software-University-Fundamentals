package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> dictionary = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            dictionary.putIfAbsent(word, new ArrayList<>());
            dictionary.get(word).add(synonym);
        }

        for (var entry : dictionary.entrySet()){
            System.out.print(entry.getKey() + " - ");
            System.out.print(String.join( ", ",entry.getValue()));
            System.out.println();
        }
    }
}

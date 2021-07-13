package MidExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> deck = new ArrayList<String>();
        List<String> newDeck = new ArrayList<String>();

        for (String s : scanner.nextLine().split(":")){
            deck.add(s);
        }

        String input = scanner.nextLine();

        while (!input.equals("Ready")){

            String command = input.split("\\s+")[0].trim();
            String cardName = input.split("\\s+")[1].trim();

            switch (command){
                case "Add":

                    if (deck.contains(cardName)){

                        newDeck.add(cardName);
                    }else{
                        System.out.println("Card not found.");
                    }

                    break;

                case "Insert":

                    int index = Integer.parseInt(input.split("\\s+")[2].trim());

                    if (deck.contains(cardName)
                    && index >= 0 && index < deck.size()){
                        newDeck.add(index, cardName);//may need more
                    }else{
                        System.out.println("Error!");
                    }

                    break;

                case "Remove":

                    if (newDeck.contains(cardName)){

                        newDeck.remove(cardName);
                    }else{
                        System.out.println("Card not found.");
                    }

                    break;

                case "Swap":

                    String cardName2 = input.split("\\s+")[2].trim();

                    int indexCard1 = newDeck.indexOf(cardName);
                    int indexCard2 = newDeck.indexOf(cardName2);

                    newDeck.set(indexCard1, cardName2);
                    newDeck.set(indexCard2, cardName);

                    break;

                case "Shuffle":

                    Collections.reverse(newDeck);

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(" ", newDeck));
    }
}

package MidExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {//33

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceryList = new ArrayList<String>();

        for (String s : scanner.nextLine().split("!")){
            groceryList.add(s);
        }

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")){

            String command = input.split("\\s+")[0].trim();
            String item = input.split("\\s+")[1].trim();

            switch (command){
                case "Urgent":

                    if (!groceryList.contains(item)){
                        groceryList.add(0, item);
                    }

                    break;

                case "Unnecessary":

                    if (groceryList.contains(item)){
                        groceryList.remove(item);
                    }

                    break;

                case "Correct":

                    String oldItem = input.split("\\s+")[1];
                    String newItem = input.split("\\s+")[2];

                    if (groceryList.contains(oldItem)){
                        groceryList.set(groceryList.indexOf(oldItem), newItem);
                    }

                    break;

                case "Rearrange":

                    if (groceryList.contains(item)){
                        groceryList.remove(item);
                        groceryList.add(item);
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", groceryList));
    }
}

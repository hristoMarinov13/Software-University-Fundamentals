package MidExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsArrList = new ArrayList<String>();

        for (String s : scanner.nextLine().split(",")) {
            itemsArrList.add(s.trim());
        }

        String input = scanner.nextLine();

        while (!input.equals("Craft!")){
            String command = input.split("\\s-\\s")[0];
            String item = input.split("\\s-\\s")[1];

            switch (command){
                case "Collect":

                    if (!itemsArrList.contains(item)){
                        itemsArrList.add(item);
                    }

                    break;

                case "Drop":

                    if (itemsArrList.contains(item)){
                        itemsArrList.remove(item);
                    }
                    break;

                case "Combine Items":

                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];

                    if (itemsArrList.contains(oldItem)){

                        for (int i = 0; i < itemsArrList.size(); i++) {
                            String currItem = itemsArrList.get(i);

                            if (currItem.equals(oldItem)){
                                itemsArrList.add(i + 1, newItem);
                                break;
                            }
                        }
                    }
                    break;

                case "Renew":

                    if (itemsArrList.contains(item)){
                        itemsArrList.remove(item);
                        itemsArrList.add(item);
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", itemsArrList));

    }

}

package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            Integer parseInt = Integer.parseInt(s);
            list.add(parseInt);
        }

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.split(" ")[0].equals("Delete")){

                int numberForRemoval = Integer.parseInt(command.split(" ")[1]);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(numberForRemoval)){
                        list.remove(list.get(i));
                    }
                }

            }else if (command.split(" ")[0].equals("Insert")){

                int position = Integer.parseInt(command.split(" ")[2]);
                int numberForInsertion = Integer.parseInt(command.split(" ")[1]);

                list.add(position, numberForInsertion);
            }

            command = scanner.nextLine();
        }

        for (int i = 0 ;i < list.size(); i++){
            System.out.printf("%d ", list.get(i));
        }
    }

}

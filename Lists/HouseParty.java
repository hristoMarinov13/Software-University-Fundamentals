package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i < n ; i++){
            String input = scanner.nextLine();
            String name = input.split(" ")[0];

            if (input.split(" ")[2].equals("not")){
                if (list.contains(name)){
                    list.remove(name);
                }else {
                    System.out.printf("%s is not in the list!\n", name);
                }

            }else{
                if (list.contains(name)){
                    System.out.printf("%s is already in the list!\n", name);
                }else {
                    list.add(name);
                }

            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s%n", list.get(i));
        }
    }

}

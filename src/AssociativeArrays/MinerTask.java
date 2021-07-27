package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> minerMap = new LinkedHashMap<>();

        int count = 0;
        String resource = "";
        int quantity = 0;


        while (!input.equals("stop")){
            count++;

            if (count % 2 != 0){
                //even
                resource = input;

            }else{
                //odd
                quantity = Integer.parseInt(input);

                //check if resource exists!!!
                if (minerMap.containsKey(resource)) {
                    //resource exists

                    int existingQuantity = minerMap.get(resource);
                    quantity += existingQuantity;
                }
                minerMap.put(resource, quantity);
            }
            input = scanner.nextLine();
        }

        minerMap.entrySet().stream().
                forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}

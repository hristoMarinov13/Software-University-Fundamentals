package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        int wagonMax = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){

             if (command.split(" ")[0].equals("Add")){
                wagons.add(Integer.parseInt(command.split(" ")[1]));

             }else {
                 for (int i = 0; i < wagons.size(); i++) {
                     int sum = wagons.get(i) + Integer.parseInt(command);
                     if ( sum <= wagonMax){
                         wagons.set(i, sum);
                         break;
                     }
                 }
             }
            command = scanner.nextLine();
        }

        for (int i = 0; i < wagons.size(); i++) {
            System.out.printf("%d ", wagons.get(i));
        }
    }
}

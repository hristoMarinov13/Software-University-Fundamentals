package MidExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {//14:02
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhood = new ArrayList<Integer>();
        for (String s : scanner.nextLine().split("@")){
            Integer integer = Integer.parseInt(s);
            neighborhood.add(integer);
        }

        int houseIndex = 0;
        String command = scanner.nextLine();

        while (!command.equals("Love!")){

            int jumpLength = Integer.parseInt(command.split("\\s+")[1]);
            int heartsNeeded;



            if (houseIndex + jumpLength >= neighborhood.size()
                    || houseIndex + jumpLength < 0){
                houseIndex = 0;
                jumpLength = 0; //address out of bounds, goes tot he first house
            }

            houseIndex += jumpLength;
            heartsNeeded = neighborhood.get(houseIndex);

            if (heartsNeeded > 0){

                if (heartsNeeded - 2 >= 0){
                    neighborhood.set(houseIndex, heartsNeeded - 2);
                }else{
                    neighborhood.set(houseIndex, 0);
                }

                if (neighborhood.get(houseIndex) == 0){
                    System.out.printf("Place %d has Valentine's day.\n", houseIndex);
                }

            }else{
                System.out.printf("Place %d already had Valentine's day.\n", houseIndex);
            }

            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.\n", houseIndex);


        boolean missionCompleted = true;
        int failsCounter = 0;

        for (int i = 0 ; i < neighborhood.size() ; i++){

            if (neighborhood.get(i) > 0){
                missionCompleted = false;
                failsCounter++;
            }
        }

        if (missionCompleted){
            System.out.println("Mission was successful.\n");

        }else{
            System.out.printf("Cupid has failed %d places.\n", failsCounter);
        }

    }
}

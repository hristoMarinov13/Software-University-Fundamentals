package MidExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = (int)(Double.parseDouble(scanner.nextLine())*1000);
        int hay = (int)(Double.parseDouble(scanner.nextLine())*1000);
        int cover = (int)(Double.parseDouble(scanner.nextLine())*1000);
        int pigsWeight = (int)(Double.parseDouble(scanner.nextLine())*1000);


//
//        System.out.println(cover - pigsWeight/3);


        for (int dayCounter = 1; dayCounter <= 30 ; dayCounter++) {


            food -= 300;//food every day

            if (dayCounter % 2 == 0){
                //hay time
                hay -= food * 5/100;
            }

            if (dayCounter % 3 == 0 ){
                //cover time
                cover -= pigsWeight/3;
            }


        }

        double food1 = (double)food/1000;
        double hay1 = (double)hay/1000;
        double cover1 = (double)cover/1000;

//        System.out.println(food1);
//        System.out.println(hay1);
//        System.out.println(cover1);

        if (food > 0 && hay > 0 && cover > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.\n",
                    food1, hay1, cover1);
        }else{
            System.out.println("Merry must go to the pet store!");
        }

    }
}

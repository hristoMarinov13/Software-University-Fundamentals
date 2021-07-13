package MidExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        int roomsCounter = 0;
        boolean isDead = false;

        String[] roomsArray = scanner.nextLine().split("\\|"); // "room1", "room2", "room3"

        for (int i = 0; i < roomsArray.length; i++) {
            roomsCounter++;

            String[] currentRoom = roomsArray[i].trim().split("\\s+");

            String command = currentRoom[0];
            int number = Integer.parseInt(currentRoom[1]);

           if (command.equals("potion")){
               int heal = number;

               if (health + heal > 100){
                   heal = 100 - health;
               }

               health += heal;

               System.out.printf("You healed for %d hp.%n", heal);
               System.out.printf("Current health: %d hp.%n", health);

           }else if(command.equals("chest")){

               bitcoins += number;
               System.out.printf("You found %d bitcoins.%n",  number);

           }else{
               // monster

               health -= number;//attacked and lost health

               if (health > 0){
                   System.out.printf("You slayed %s.%n", command);
               }else{
                   System.out.printf("You died! Killed by %s.%n", command);
                   System.out.printf("Best room: %d %n", roomsCounter);
                   isDead = true;
                   break;
               }
           }
        }

        if (!isDead){
            System.out.print("You've made it!\n");
            System.out.printf("Bitcoins: %d\n", bitcoins);
            System.out.printf("Health: %d\n", health);
        }

    }
}

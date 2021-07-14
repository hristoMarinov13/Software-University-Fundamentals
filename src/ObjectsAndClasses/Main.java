package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Vehicle> vehicles = new ArrayList<>();


        while (!command.equals("End")){

            String type = command.split("\\s+")[0];
            String model= command.split("\\s+")[1];
            String colour = command.split("\\s+")[2];
            int horsePower = Integer.parseInt(command.split("\\s+")[3]);


            vehicles.add(new Vehicle(type, model, colour, horsePower));

            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while (!command.equals("Close the Catalogue")){

            for (Vehicle vehicle : vehicles) {
                if(vehicle.getModel().equals(command)){
                    System.out.print(vehicle.toString());
                }
            }

            command = scanner.nextLine();
        }

        int carsCounter =0;
        int carHPs = 0;
        int trucksCounter = 0;
        int truckHPs = 0;

        for (Vehicle vehicle : vehicles) {
            if(vehicle.getType().equals("car")){
                carsCounter++;
                carHPs += vehicle.getHorsePower();

            }else if (vehicle.getType().equals("truck")){
                trucksCounter++;
                truckHPs += vehicle.getHorsePower();
            }
        }

        double carsAvgHP = (double) carHPs / carsCounter;
        double trucksAvgHP = (double)truckHPs / trucksCounter;

        System.out.printf("Cars have average horsepower of: %.2f.\n",carsAvgHP );
        System.out.printf("Trucks have average horsepower of: %.2f.\n",trucksAvgHP );
    }
}

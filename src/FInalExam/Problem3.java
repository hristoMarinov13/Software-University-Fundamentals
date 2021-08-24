package FInalExam;

import java.util.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Animal> animalMap = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("EndDay")){
            String action = command.split("\\s+")[0];
            String str = command.split("\\s+")[1];

            if (action.equals("Add:")){
                String animalName = str.split("\\-")[0];
                int neededFood = Integer.parseInt(str.split("\\-")[1]);
                String area = str.split("\\-")[2];

                if (!animalMap.containsKey(animalName)){
                    Animal newAnimal = new Animal();
                    newAnimal.setName(animalName);
                    newAnimal.setFood(neededFood);
                    newAnimal.setArea(area);

                    animalMap.put(animalName, newAnimal);
                }
                else{
                    Animal existingAnimal = animalMap.get(animalName);
                    int foodUpdate = existingAnimal.getFood() + neededFood;
                    existingAnimal.setFood(foodUpdate);
                    animalMap.put(animalName, existingAnimal);
                }
            }
            else if (action.equals("Feed:")){
                String animalName = str.split("\\-")[0];
                int foodFed = Integer.parseInt(str.split("\\-")[1]);

                if (animalMap.containsKey(animalName)){
                    Animal existingAnimal = animalMap.get(animalName);
                    int foodUpdate = existingAnimal.getFood() - foodFed;
                    existingAnimal.setFood(foodUpdate);
                    animalMap.put(animalName, existingAnimal);

                    if (existingAnimal.getFood() <= 0){
                        System.out.println(animalName + " was successfully fed");
                        animalMap.remove(animalName);
                    }
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Animals:");

        animalMap
                .entrySet()
                .stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().getFood(), p1.getValue().getFood());
                    if (result == 0) {
                        result = CharSequence.compare(p1.getValue().getName(), p2.getValue().getName());
                    }
                    return result;
                }).forEach(p -> System.out.printf(" %s -> %sg\n",
                p.getKey(),
                p.getValue().getFood()
                ));

        System.out.println("Areas with hungry animals:");

        Map<String, Integer> hungryAnimals = new TreeMap<>();

        for (var entry : animalMap.entrySet()) {
            String area = entry.getValue().getArea();
            if (entry.getValue().getFood() > 0){
                if (!hungryAnimals.containsKey(area)){
                    hungryAnimals.put(area, 1);
                }else{
                    int ha = hungryAnimals.get(area);
                    hungryAnimals.put(area, ha+1);
                }
            }
        }

        hungryAnimals
                .entrySet()
                .forEach(p -> System.out.printf(" %s: %s\n",
                        p.getKey(),
                        p.getValue()
                ));

    }
}

class Animal{
    private String name;
    private int food;
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public int getFood() {
        return food;
    }
}

package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Person1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("End")){

            String[] elements = command.split("\\s+");
            String name = elements[0];
            String ID = elements[1];
            int age = Integer.parseInt(elements[2]);

            Person person = new Person(name, ID, age);
            people.add(person);

            command = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));

        for (Person person: people) {
            System.out.println(person.toString());
        }

    }
}

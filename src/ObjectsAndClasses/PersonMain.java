package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String personalData = scanner.nextLine();

            String name = personalData.split("\\s")[0];
            int age = Integer.parseInt(personalData.split("\\s")[1]);


//            if (age > 30){
//                Person person = new Person(name, age);
//                people.add(person);
//            }
        }

        //people = people.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        people.sort(Comparator.comparing(Person::getName));

        for (Person p : people) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }

}

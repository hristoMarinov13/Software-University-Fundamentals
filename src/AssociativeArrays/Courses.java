package AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if (!coursesMap.containsKey(course)){

                List<String> newList = new ArrayList<>();
                newList.add(student);

                coursesMap.put(course, newList);
            }else{
                List <String> listToModify = coursesMap.get(course);
                listToModify.add(student);

                coursesMap.put(course, listToModify);
            }

            input = scanner.nextLine();
        }

        coursesMap.entrySet().stream().
                sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())).
                //sorts the keys (course names) for the people inside by descending order

                forEach(entry -> {
                    // for each course values (ArrayList) in lambda expression
                    List<String> students = entry.getValue();
                    System.out.println(entry.getKey() + ": " + students.size());
                    students.stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                });

    }

}

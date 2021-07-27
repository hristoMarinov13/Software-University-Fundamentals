package AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).sorted((n1,n2) -> n2.compareTo(n1))
                .limit(3)
                .collect(Collectors.toList());

        numbers.forEach(System.out::println);
    }
}

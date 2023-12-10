package aoc.day1;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FloorCalculator {

    public static void main(String[] args) {
        String input = args[0];

        if (input == null) {
            System.out.println("Please provide a valid input");
            System.exit(1);
        }

        Long result = calculateElevation(input);

        System.out.println(result);
    }

    public static Long calculateElevation(String input) {
        Map<Character, Long> collect = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Long up = collect.get('(') != null ? collect.get('(') : 0;
        Long down = collect.get(')') != null ? collect.get(')') : 0;
        Long result = up - down;
        return result;
    }
}

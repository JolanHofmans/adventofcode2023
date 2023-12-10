package aoc.day3;

import java.util.*;

public class HouseCounter {

    public static void main(String[] args) {
        String input = args[0];

        if (input == null) {
            System.out.println("Please provide a valid input");
            System.exit(1);
        }

        try {
            System.out.println("Houses visited: " + houseCounter(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static int houseCounter(String input) {
        List<Character> chars = input.chars()
                .mapToObj(c -> (char) c)
                .toList();
        House currentHouse = new House(0, 0);

        Set<House> houses = new HashSet<>(Set.of(currentHouse));
        for (Character c : chars) {
           currentHouse = Navigator.navigate(c, currentHouse);
            houses.add(currentHouse);
        }
        return houses.size();
    }
}

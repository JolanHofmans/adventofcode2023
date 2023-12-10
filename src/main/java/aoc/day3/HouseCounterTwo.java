package aoc.day3;

import java.util.*;

public class HouseCounterTwo {

    public static void main(String[] args) {
        String input = args[0];

        if (input == null) {
            System.out.println("Please provide a valid input");
            System.exit(1);
        }

        try {
            int num = moveSanatas(input);
            System.out.println("Houses visited: " + num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static int moveSanatas(String Input) {
        House initialHouse = new House(0, 0);
        Santa santa = new Santa(initialHouse);
        Santa roboSanta = new Santa(initialHouse);
        Queue<Santa> santas = new LinkedList<>();
        santas.add(santa);
        santas.add(roboSanta);
        Set<House> houses = new HashSet<>(Set.of(initialHouse));

        List<Character> chars = Input.chars()
                .mapToObj(c -> (char) c)
                .toList();

        chars.stream()
                .forEach(c -> {
                    Santa currentSanta = santas.poll();
                    houses.add(currentSanta.move(c));
                    santas.add(currentSanta);
                });

        return houses.size();
    }
}

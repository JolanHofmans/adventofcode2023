package aoc.day1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasementDetector {

    public static void main(String[] args) {
        String input = args[0];

        if (input == null) {
            System.out.println("Please provide a valid input");
            System.exit(1);
        }

        try {
            System.out.println("Sant enters basement at: " + basementDetector(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }

    public static int basementDetector(String input) throws Exception {
        List<Character> chars = input.chars()
                .mapToObj(c -> (char) c)
                .toList();
        int base = 0;
        int i = 0;

        for( Character c : chars ) {
            i++;
            if ( c == '(' ) {
                base++;
            } else if ( c == ')' ) {
                base--;
            }
            if ( base == -1 ) {
                return i;
            }
        }
        throw new Exception("No basement found");
    }
}

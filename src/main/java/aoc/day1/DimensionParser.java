package aoc.day1;

public class DimensionParser {
    public static Dimensions parseDimension(String input) {
        String[] sides = input.split("x");
        assert sides.length == 3;
        int length = Integer.parseInt(sides[0]);
        int width = Integer.parseInt(sides[1]);
        int height = Integer.parseInt(sides[2]);
        return new Dimensions(length, width, height);
    }

    public record Dimensions(int length, int width, int height) {
    }
}

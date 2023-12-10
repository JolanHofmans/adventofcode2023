package aoc.day2;

import aoc.day1.DimensionParser;

import static aoc.day1.DimensionParser.parseDimension;

public class WrappingPaperCalculator {

    public static void main(String[] args) {
        Long area = 0L;
        for (String input : args) {
            if (input == null) {
                System.out.println("Please provide a valid input");
                System.exit(1);
            }

            try {
                Long result = getNeededWrappingPaper(input);
                area += result;
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid input");
                System.exit(1);
            }
        }

        System.out.println("Total needed wrapping paper: " + area);
    }

    public static Long getNeededWrappingPaper(String input) {
        DimensionParser.Dimensions dimensions = parseDimension(input);
        Long result = calculateArea(dimensions.length(), dimensions.width(), dimensions.height());
        return result;
    }



    private static Long calculateArea(int length, int width, int height) {
        int side1 = length * width;
        int side2 = width * height;
        int side3 = height * length;
        int smallestSide = Math.min(Math.min(side1, side2), side3);
        return (long) (2 * side1 + 2 * side2 + 2 * side3 + smallestSide);

    }
}

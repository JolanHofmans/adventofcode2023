package aoc.day2;

import aoc.day1.DimensionParser;

public class RibbonCalculator {

    public static void main(String[] args) {
        Long length = 0L;
        for (String input : args) {
            if (input == null) {
                System.out.println("Please provide a valid input");
                System.exit(1);
            }

            try {
                Long result = getLengthNeededRibbon(input);
                length += result;
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid input");
                System.exit(1);
            }
        }

        System.out.println("Total needed ribbon length: " + length);
    }

    public static Long getLengthNeededRibbon(String input) {
        DimensionParser.Dimensions dimensions = DimensionParser.parseDimension(input);
        Long result = calculateLength(dimensions.length(), dimensions.width(), dimensions.height());
        return result;
    }

    private static Long calculateLength(int length, int width, int height) {
        Long around = (long) 2 * (length + width + height - Math.max(Math.max(length, width), height));
        Long bow = (long) length * width * height;
        return around + bow;
    }


}

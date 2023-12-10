package aoc.day3;

public class Navigator {

    public static House navigate(Character direction, House house) {
        return switch (direction) {
            case '^' ->
                    new House(house.x(), house.y() + 1);
            case 'v' ->
                    new House(house.x(), house.y() - 1);
            case '<' ->
                    new House(house.x() - 1, house.y());
            case '>' ->
                    new House(house.x() + 1, house.y());
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
    }
}

package aoc.day3;

public class Santa {
    private House house;
    public Santa(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public House move(Character direction) {
        return house = Navigator.navigate(direction, house);
    }
}

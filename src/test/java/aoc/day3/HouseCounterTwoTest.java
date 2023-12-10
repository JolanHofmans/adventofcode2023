package aoc.day3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class HouseCounterTwoTest {

    @ParameterizedTest
    @CsvSource({
            "^v,3",
            "^>v<,3",
            "^v^v^v^v^v,11"
    })
    void calculateArea(String input, int expected) {
        assertThat(HouseCounterTwo.moveSanatas(input)).isEqualTo(expected);
    }

    @Test
    void test() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));

        String[] args = {"^v^v^v^v^v"};
        HouseCounterTwo.main(args);

        assertThat(outContent.toString().strip()).isEqualTo("Houses visited: 11");
    }

}
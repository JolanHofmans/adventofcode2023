package aoc.day3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class HouseCounterTest {

    @ParameterizedTest
    @CsvSource({
            ">,2",
            "^>v<,4",
            "^v^v^v^v^v,2"
    })
    void calculateArea(String input, int expected) {
        assertThat(HouseCounter.houseCounter(input)).isEqualTo(expected);
    }

    @Test
    void test() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));

        String[] args = {"^v^v^v^v^v"};
        HouseCounter.main(args);

        assertThat(outContent.toString().strip()).isEqualTo("Houses visited: 2");
    }

}
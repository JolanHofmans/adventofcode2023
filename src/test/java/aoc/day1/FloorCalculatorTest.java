package aoc.day1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class FloorCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "(())(), 0",
            "()(), 0",
            "(((, 3",
            "(()(()(, 3",
            "))(((((, 3",
            "()), -1",
            "))(, -1",
            "))), -3",
            ")())()), -3",
    })
    void calculateElevation(String input, Long expected) {
        assertThat(FloorCalculator.calculateElevation(input)).isEqualTo(expected);
    }

}
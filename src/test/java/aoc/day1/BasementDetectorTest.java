package aoc.day1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class BasementDetectorTest {

    @ParameterizedTest
    @CsvSource({
            "), 1",
            "()()), 5",
    })
    void basementDetector(String input, int expected) throws Exception {
        assertThat(BasementDetector.basementDetector(input)).isEqualTo(expected);
    }


}
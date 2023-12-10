package aoc.day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class RibbonCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "2x3x4,34",
            "1x1x10,14"
    })
    void calculateArea(String dimensions, Long expected) {
        assertThat(RibbonCalculator.getLengthNeededRibbon(dimensions)).isEqualTo(expected);
    }

    @Test
    void list() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));

        String[] args = {"2x3x4", "1x1x10"};
        RibbonCalculator.main(args);

        assertThat(outContent.toString().strip()).isEqualTo("Total needed ribbon length: 48");
    }

}
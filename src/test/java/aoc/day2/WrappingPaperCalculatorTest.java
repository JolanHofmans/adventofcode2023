package aoc.day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class WrappingPaperCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "2x3x4,58",
            "1x1x10,43"
    })
    void calculateArea(String dimensions, Long expected) {
        assertThat(WrappingPaperCalculator.getNeededWrappingPaper(dimensions)).isEqualTo(expected);
    }

    @Test
    void list() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));

        String[] args = {"2x3x4", "1x1x10"};
        WrappingPaperCalculator.main(args);

        assertThat(outContent.toString().strip()).isEqualTo("Total needed wrapping paper: 101");
    }

}
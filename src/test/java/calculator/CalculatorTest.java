package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"2:3:5", "0:4:4", "-1:-2:-3"}, delimiter = ':')
    @DisplayName("덧셈")
    void add_formula(int leftNum, int rightNum, int expected) {
        Calculator calculator = new Calculator();

        assertThat(calculator.add(leftNum, rightNum))
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"3:2:1", "4:0:4", "-1:-2:1"}, delimiter = ':')
    @DisplayName("뺄셈")
    void subtract_formula(int leftNum, int rightNum, int expected) {
        Calculator calculator = new Calculator();

        assertThat(calculator.sub(leftNum, rightNum))
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"2:3:6", "0:4:0", "-1:-2:2"}, delimiter = ':')
    @DisplayName("곱셈")
    void multiply_formula(int leftNum, int rightNum, int expected) {
        Calculator calculator = new Calculator();

        assertThat(calculator.multiply(leftNum, rightNum))
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"4:2:2", "0:4:0", "15:5:3"}, delimiter = ':')
    @DisplayName("나눗셈")
    void divide_formula(int leftNum, int rightNum, int expected) {
        Calculator calculator = new Calculator();

        assertThat(calculator.div(leftNum, rightNum))
                .isEqualTo(expected);
    }
}

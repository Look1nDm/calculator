package HomeworkSkypro.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest2 {
    CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    public static Stream<Arguments> provideTest() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(2, 2),
                Arguments.of(2, 3),
                Arguments.of(0, 3)


        );
    }

    @ParameterizedTest
    @MethodSource("provideTest")
    public void shouldSumCorrectly(int a, int b) {
        int result = calculatorServiceImpl.plus(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideTest")
    public void shouldMinusCorrectly(int a, int b) {
        int result = calculatorServiceImpl.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideTest")
    public void shouldMultiplayCorrectly2(int a, int b) {
        int result = calculatorServiceImpl.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideTest")
    public void shouldDivedeCorrectly3(int a, int b) {
        int result = calculatorServiceImpl.divide(a,b);
        assertEquals(a / b, result);
    }
}
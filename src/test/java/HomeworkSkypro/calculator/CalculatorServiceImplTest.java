package HomeworkSkypro.calculator;

import org.apache.coyote.http11.filters.IdentityOutputFilter;
import org.junit.jupiter.api.Test;

import java.io.DataOutput;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    public final CalculatorServiceImpl calculator = new CalculatorServiceImpl();
    public final int number3 = 3;
    public final int number4 = 0;
    public final int number1 = 4;
    public final int number2 = -5;
    @Test
    void plusNullNumbers() {
        int expected = number3+number4;
        int actual = calculator.plus(number3, number4);
        assertEquals(expected, actual);
    }

    @Test
    void plusNegativeNumbers() {
        int expected = number1+number2;
        int actual = calculator.plus(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    void minusNegativeNumbers() {
        int expected = number1-number2;
        int actual = calculator.minus(number1, number2);
        assertEquals(expected, actual);
    }
    @Test
    void minusNullNumbers() {
        int expected = number3-number4;
        int actual = calculator.minus(number3, number4);
        assertEquals(expected, actual);
    }


    @Test
    void multiplyIsNull() {
        int expected = number3*number4;
        int actual = calculator.multiply(number3, number4);
        assertEquals(expected, actual);
    }
    @Test
    void multiplyNegativeNumbers() {
        int expected = number1*number2;
        int actual = calculator.multiply(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    void divideNegativeNumbers() {
        double expected = number1/number2;
        double actual = calculator.divide(number1,number2);
        assertNotNull(number2);
        assertEquals(expected,actual);
    }
    @Test
    void divideNotNUll(){
        calculator.divide(number1,number2);
        assertNotNull(number2);
    }
    @Test
    void divideSendMessageException(){
        assertThrows(IllegalArgumentException.class, ()->calculator.divide(number3,number4));
    }
}
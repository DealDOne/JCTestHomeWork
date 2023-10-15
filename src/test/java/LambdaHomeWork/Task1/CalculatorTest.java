package LambdaHomeWork.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testPlusOperation_success(){
        // given:
        final int a = 1;
        final int b = 2;
        final int expected = 3;
        // when
        final int result = Calculator.instance.get().plus.apply(a, b);
        // then
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivideByZero_throwsException() {
        // given:
        final int a = 2;
        final int b = 0;
        // expect
        Assertions.assertThrows(ArithmeticException.class, () -> {Calculator.instance.get().divideByZero.apply(a, b);});
    }
    @Test
    public void testPow_nullArgument_throwsException () {
        // expect:
        assertThrows(NullPointerException.class, () -> Calculator.instance.get().pow.apply(null));
    }

}
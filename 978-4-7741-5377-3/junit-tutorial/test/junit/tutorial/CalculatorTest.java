package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest
{
    @Test
    public void multiplyで３と４の乗算結果が取得できる()
    {
        Calculator cltr = new Calculator();

        int intExpected = 12;

        int intActual = cltr.multiply(3, 4);

        assertThat(intActual, is(intExpected));
    }

    @Test
    public void multiplyで５と７の乗算結果が取得できる()
    {
        Calculator cltr = new Calculator();

        int intExpected = 35;

        int intActual = cltr.multiply(5, 7);

        assertThat(intActual, is(intExpected));
    }
}

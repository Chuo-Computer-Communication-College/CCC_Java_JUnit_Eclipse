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

    @Test
    public void divideで３と２の除算結果が取得できる()
    {
        Calculator cltr = new Calculator();

        float fltExpected = 1.5f;

        float fltActual = cltr.divide(3, 2);

        assertThat(fltActual, is(fltExpected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideで５と０の時IllegalArgumentExceptionを送出する()
    {
        Calculator cltr = new Calculator();

        cltr.divide(5, 0);
    }
}

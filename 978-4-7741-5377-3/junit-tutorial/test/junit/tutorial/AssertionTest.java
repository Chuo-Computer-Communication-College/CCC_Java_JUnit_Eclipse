package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AssertionTest
{
    @Test
    public void assertion()
    {
        String actual = "Hello" + " " + "World";

        assertThat(actual, is("Hello World"));
    }
}

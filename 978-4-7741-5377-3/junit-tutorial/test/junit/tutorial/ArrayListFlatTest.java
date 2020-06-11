package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListFlatTest
{
    private ArrayList<String> sut;

    @Before
    public void setUp() throws Exception
    {
        sut = new ArrayList<String>();
    }

    @Test
    public void listに１件追加してある場合_sizeは1を返す() throws Exception
    {
        sut.add("A");

        int actual = sut.size();

        assertThat(actual, is(1));
    }

    @Test
    public void listに２件追加してある場合_sizeは2を返す() throws Exception
    {
        sut.add("A");
        sut.add("B");

        int actual = sut.size();

        assertThat(actual, is(2));
    }
}

package junit.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SlowAndFastTest
{
    @Test
    public void fastTest_01() throws Exception
    {
        fail("まだ実装されていません");
    }

    @Category(SlowTests.class)
    @Test
    public void slowTest_01() throws Exception
    {
        fail();
    }

    @Category(SlowTests.class)
    @Test
    public void slowTest_02() throws Exception
    {
        fail();
    }
}

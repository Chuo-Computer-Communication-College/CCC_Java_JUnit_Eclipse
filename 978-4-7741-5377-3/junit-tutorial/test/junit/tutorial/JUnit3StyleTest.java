package junit.tutorial;

public class JUnit3StyleTest extends junit.framework.TestCase
{
    protected void setUp() throws Exception
    {

    }

    protected void tearDown() throws Exception
    {

    }

    public void test加算のテスト() throws Exception
    {
        assertEquals(7, 3 + 4);
    }
}

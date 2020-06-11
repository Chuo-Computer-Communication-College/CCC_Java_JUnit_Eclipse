package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest
{
    public static class 空の場合
    {
        ItemStock sut;

        @Before
        public void setUp() throws Exception
        {
//            sut = new ItemStockImpl();
        }

        @Test
        public void size_Aが0を返す() throws Exception
        {
            assertThat(sut.size("A"), is(0));
        }

        @Test
        public void contains_Aがfalseを返す() throws Exception
        {
            assertThat(sut.contains("A"), is(false));
        }
    }

    public static class 商品Ａを１件含む場合
    {
        ItemStock sut;

        @Before
        public void setUp() throws Exception
        {
//            sut = new ItemStockImpl();

            sut.add("A", 1);
        }

        @Test
        public void sizeが1を返す() throws Exception
        {
            assertThat(sut.size("A"), is(1));
        }

        @Test
        public void contains_Aがtrueを返す() throws Exception
        {
            assertThat(sut.contains("A"), is(true));
        }
    }
}

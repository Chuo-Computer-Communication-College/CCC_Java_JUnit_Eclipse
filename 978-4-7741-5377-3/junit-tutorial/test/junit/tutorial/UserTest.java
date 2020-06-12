package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class UserTest
{
    public static class インスタンス化テスト
    {
        @Test
        public void デフォルトコンストラクター() throws Exception
        {
            User instance = new User();

//            assertThat(instance.getName(), is("nobody"));
//            assertThat(instance.isAdmin(), is(false));
        }
    }
}

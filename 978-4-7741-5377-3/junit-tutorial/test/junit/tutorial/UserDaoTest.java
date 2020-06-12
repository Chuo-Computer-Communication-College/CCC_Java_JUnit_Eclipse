package junit.tutorial;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class UserDaoTest
{
    private UserDao sut;

//    @Rule
//    public InMemoryDBRule db = new InMemoryDBRule();

    @Before
    public void setUp() throws Exception
    {
        sut = new UserDao();
    }

    @Test
    public void getListは０件を返す() throws Exception
    {

    }
}

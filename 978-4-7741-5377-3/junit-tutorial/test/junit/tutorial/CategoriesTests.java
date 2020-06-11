package junit.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@ExcludeCategory(SlowTests.class)
@RunWith(Categories.class)
@SuiteClasses(SlowAndFastTest.class)
public class CategoriesTests
{

}

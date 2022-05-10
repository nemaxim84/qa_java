package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionDoesHaveManePositiveTest {
    @Parameterized.Parameter
    public Lion lion;
    @Parameterized.Parameter(1)
    public boolean hasManeExpected;

    public LionDoesHaveManePositiveTest() throws Exception {
    }

    @Parameterized.Parameters
    public static Object[][] params() throws Exception {
        return new Object[][]{
                {new Lion(new Feline(), "Самец"), true},
                {new Lion(new Feline(), "Самка"), false},
        };
    }

    @Test
    public void doesHaveMane() {
        Assert.assertEquals(lion.doesHaveMane(), hasManeExpected);
    }
}
package cat.tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatGetSoundTest {
    private Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat(new Feline());
    }

    @Test
    public void getSound() {
        Assert.assertEquals(cat.getSound(), "Мяу");
    }

    @Test
    public void getSoundError() {
        Assert.assertNotEquals(cat.getSound(), "Гав");
    }
}
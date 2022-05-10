package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class LionGetKittenTest {
    Lion lion = new Lion(new Feline(), "Самец");

    public LionGetKittenTest() throws Exception {
    }
    @Test
    public void getKittens() {
        Assert.assertEquals(lion.getKittens(), 1);
    }
}
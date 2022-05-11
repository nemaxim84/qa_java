package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

public class CatGetFoodTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    private Feline feline;

    private Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat(feline);
    }
    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

public class LionGetFoodTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    private Feline feline;

    private Lion lion;

    @Before
    public void setup() throws Exception {
        lion = new Lion(feline, "Самец");
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
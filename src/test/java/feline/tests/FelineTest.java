package feline.tests;

import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import net.bytebuddy.build.AccessControllerPlugin;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.security.PrivateKey;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class FelineTest {
    private Feline feline;
    @Before
          public void setup(){
        feline = new Feline();
    }

    @Test
    public void eatMeat() throws Exception {
        Assert.assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamily() {
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void getKittens() {
        Assert.assertEquals(feline.getKittens(), 1);
    }
}
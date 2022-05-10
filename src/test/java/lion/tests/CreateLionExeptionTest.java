package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class CreateLionExeptionTest {
    @Test(expected = Exception.class)
    public void createLionExeption() throws Exception {
        new Lion(new Feline(), "Нечто");
    }


}

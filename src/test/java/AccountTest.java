import com.example.Account;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {
    @Parameterized.Parameter
    public String name;
    @Parameterized.Parameter(1)
    public boolean checkName;

    @Parameterized.Parameters
    public static Object[][] params() {
        return new Object[][]{
                {"Max Mel", true},
                {" Max Mel", false},
                {"Max Mel ", false},
                {" Max Mel ", false},
                {"Max Mel5555555777777", false},
                {"Max", false},
                {"Ma", false},
                {" MaxMel", false},
                {"MaxMel ", false},
        };
    }

    @Test
    @DisplayName("Проверка работы проверки валидности имени")
    public void checkNameTest() {
        Assert.assertEquals(new Account(name).checkNameToEmboss(), checkName);
    }
}
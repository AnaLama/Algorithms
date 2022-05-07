
import org.junit.jupiter.api.*;

public class StringToLettersAndSpaceTests {
    @Test
    public void testGetLettersHappyPath() {
        String str = "fh jr8724%(dhcv@! 8874";
        String expectedResult = "fh jrdhcv ";

        StringToLettersAndSpace let = new StringToLettersAndSpace();
        String actualResult = let.getLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}

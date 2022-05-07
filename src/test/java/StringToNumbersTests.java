import org.junit.jupiter.api.*;

public class StringToNumbersTests {
    @Test
    public void testGetNumbersHappyPath() {
        String str = "fhjr8724%(dhcv@!8874";
        String expectedResult = "87248874";

        StringToNumbers num = new StringToNumbers();
        String actualResult = num.getNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetNumbersNegativeHappyPath() {
        String str = "fhjr-8724%(dhcv@!8-87-4";
        String expectedResult = "-87248-87-4";

        StringToNumbers num = new StringToNumbers();
        String actualResult = num.getNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetNumbersDecimalHappyPath() {
        String str = "fhjr8724%(dhcv@!8.874";
        String expectedResult = "87248.874";

        StringToNumbers num = new StringToNumbers();
        String actualResult = num.getNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

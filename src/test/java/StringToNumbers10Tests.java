import org.junit.jupiter.api.*;

public class StringToNumbers10Tests {
// Test Data:
//“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
@Test
public void TestStringToNumbersHappyPath() {
    String str = "1, 2, 3, 4, 5";
    int[] expectedResult = {1, 2, 3, 4, 5};

    StringToNumbers10 strToNum = new StringToNumbers10();
    int[] actualResult = strToNum.stringToNum(str);

    Assertions.assertArrayEquals(expectedResult, actualResult);
}
}

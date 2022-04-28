import org.junit.jupiter.api.*;

public class AreNumbersEqualTests {
    // Test Data:
//89, 89
//Expected result: 0
//-89, 89
//Expected result: -1
//89, -89
//Expected result: 1
    @Test
    public void TestisNumberEqualHappyPath() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual arNumEq = new AreNumbersEqual();
        int actualResult = arNumEq.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void TestisNumberEqualLowerHappyPath() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual arNumEq = new AreNumbersEqual();
        int actualResult = arNumEq.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void TestisNumberEqualBiggerHappyPath() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual arNumEq = new AreNumbersEqual();
        int actualResult = arNumEq.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

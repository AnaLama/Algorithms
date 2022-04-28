import org.junit.jupiter.api.*;

public class OddEvenAlgorithmTests {

    // Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”
    @Test
    public void TestOddEvenOddHappyPath() {
        int a = -345;
        String expectedResult = "Odd";

        OddEvenAlgorithm oddEv = new OddEvenAlgorithm();
        String actualResult = oddEv.EvenOdd(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestOddEvenZeroHappyPath() {
        int a = 0;
        String expectedResult = "Even";

        OddEvenAlgorithm oddEv = new OddEvenAlgorithm();
        String actualResult = oddEv.EvenOdd(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestOddEvenBigEvenHappyPath() {
        int a = 222222;
        String expectedResult = "Even";

        OddEvenAlgorithm oddEv = new OddEvenAlgorithm();
        String actualResult = oddEv.EvenOdd(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestOddEvenNegative() {
        int a = (2147483647 + 1);
        String expectedResult = "Undefined";

        OddEvenAlgorithm oddEv = new OddEvenAlgorithm();
        String actualResult = oddEv.EvenOdd(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

   }

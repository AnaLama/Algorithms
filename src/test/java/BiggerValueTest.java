import org.junit.jupiter.api.*;

public class BiggerValueTest {
// Test Data:
//3333, 9999
//Expected Result = 9999
    @Test
        public void testBiggerValueHappyPath(){
    int a = 3333;
    int b = 9999;
    int expectedResult = 9999;

    BiggerValue bigVal = new BiggerValue();
    int actualResult = bigVal.getBiggerValue(a , b);

    }
    @Test
    public void testBiggerValueNegativeNumHappyPath(){
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue bigVal = new BiggerValue();
        int actualResult = bigVal.getBiggerValue(a , b);

    }
    @Test
    public void testBiggerValueBigNumHappyPath(){
        int a = 3333;
        int b = Integer.MAX_VALUE;
        int expectedResult = Integer.MAX_VALUE;

        BiggerValue bigVal = new BiggerValue();
        int actualResult = bigVal.getBiggerValue(a , b);

    }
    @Test
    public void testBiggerValueZeroHappyPath(){
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bigVal = new BiggerValue();
        int actualResult = bigVal.getBiggerValue(a , b);

    }



}

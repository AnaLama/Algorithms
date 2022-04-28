import org.junit.jupiter.api.*;

public class SumArrayTest {
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    @Test
public void testSumArrayHappyPath(){
    int [] array = new int[]{0, 1, 2, 3, 4, 5};
    int expectedResult = 15;

    SumArray sumAr = new SumArray();
    int actualResult = sumAr.sumArray(array);

    Assertions.assertEquals(expectedResult, actualResult);
}

    @Test
    public void testSumArrayNegativeNumHappyPath(){
        int [] array = new int[]{-7, -3};
        int expectedResult = -10;

        SumArray sumAr = new SumArray();
        int actualResult = sumAr.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

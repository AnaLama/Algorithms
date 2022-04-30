import org.junit.jupiter.api.*;

public class MinMaxAveTests {
 //   Test Data:
 //           ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    @Test
    public void testMinMaxAveHappyPath(){
       int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
       int ind1 = 2;
       int ind2 = 6;
       double[] expectedResult = {3, 7, 5};

       MinMaxAve minMAx = new MinMaxAve();
       double[] actualResult = minMAx.minMaxAve(array, ind1, ind2);

       Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveNegative(){
        int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
        int ind1 = 6;
        int ind2 = 2;
        double[] expectedResult = null;

        MinMaxAve minMAx = new MinMaxAve();
        double[] actualResult = minMAx.minMaxAve(array, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEmptyArray(){
        int[]array = {};
        int ind1 = 2;
        int ind2 = 6;
        double[] expectedResult = null;

        MinMaxAve minMAx = new MinMaxAve();
        double[] actualResult = minMAx.minMaxAve(array, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndEqual(){
        int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
        int ind1 = 2;
        int ind2 = 2;
        double[] expectedResult = null;

        MinMaxAve minMAx = new MinMaxAve();
        double[] actualResult = minMAx.minMaxAve(array, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveInd1NegativeNum(){
        int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
        int ind1 = -2;
        int ind2 = 2;
        double[] expectedResult = null;

        MinMaxAve minMAx = new MinMaxAve();
        double[] actualResult = minMAx.minMaxAve(array, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}

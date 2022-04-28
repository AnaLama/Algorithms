import org.junit.jupiter.api.*;

public class TestOddIndices {
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}

@Test
   public void testOddIndicesHappyPath() {
       int []array =  {-45, 590, 234, 985, 12, 68};
        int [] expectedResult =  {590, 985, 68};

        OddIndices oddInd = new OddIndices();
        int[]actualResult = oddInd.getOddIndices(array);

       Assertions.assertArrayEquals(expectedResult, actualResult);
   }

    @Test
    public void testOddIndicesEmptyArrayHappyPath() {
        int []array =  {};
        int [] expectedResult =  {};

        OddIndices oddInd = new OddIndices();
        int[]actualResult = oddInd.getOddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesZeroArray() {
        int []array =  {0, 0, 0, 0, 0};
        int [] expectedResult =  {0, 0};

        OddIndices oddInd = new OddIndices();
        int[]actualResult = oddInd.getOddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

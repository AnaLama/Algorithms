import org.junit.jupiter.api.*;
//{2, 7, 3, 10} → {10, 3, 7, 2}

public class ReverseArrayTests {
    @Test
    public void testReverseArrayHappyPath(){
        int [] array = {2, 7, 3, 10};
        int [] expectedResult = {10, 3, 7, 2};

        ReverseArray newAr = new ReverseArray();
        int [] actualResult = newAr.getReverseArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}

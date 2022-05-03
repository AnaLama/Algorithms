import org.junit.jupiter.api.*;

public class PeakElementTests {
//    Test Data:
//    {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPeakElementHappyPath(){
        int []array = {3, 2, 7, 5, 1, 9, 23, 1};
        int [] expectedResult = {3, 7, 23};

        PeakElement peakEl = new PeakElement();
        int [] actualResult = peakEl.peakElement(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

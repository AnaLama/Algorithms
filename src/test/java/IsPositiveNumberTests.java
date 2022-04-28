import org.junit.jupiter.api.*;

public class IsPositiveNumberTests {
    //Проверьте работу метода на числах 555, 0 и -555.
    @Test
    public void testIsPositiveNumberHappyPath() {

        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber isPosNum = new IsPositiveNumber();
        boolean actualResult = isPosNum.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testIsPositiveNumberNegativeHappyPath() {

        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber isPosNum = new IsPositiveNumber();
        boolean actualResult = isPosNum.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testIsPositiveNumberZeroHappyPath() {

        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber isPosNum = new IsPositiveNumber();
        boolean actualResult = isPosNum.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}

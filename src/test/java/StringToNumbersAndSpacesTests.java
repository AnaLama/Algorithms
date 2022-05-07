import org.junit.jupiter.api.*;

public class StringToNumbersAndSpacesTests {

           @Test
        public void testGetNumSpaceHappyPath() {
            String str = "fh jr8724%(dhcv@! 8874";
            String expectedResult = " 8724 8874";

            StringToNumbersAndSpaces num = new StringToNumbersAndSpaces();
            String actualResult = num.getNumSpace(str);

            Assertions.assertEquals(expectedResult, actualResult);
        }
}

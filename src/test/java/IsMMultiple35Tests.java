import org.junit.jupiter.api.*;

public class IsMMultiple35Tests {
//Given an integer M perform the following conditional actions:
//If M is multiple of 3 and 5 then return "Good Number".
//If M is only multiple of 3 and not of 5 then return "Bad Number"
//If M is only multiple of 5 and not of 3 then return "Poor Number"
//If M doesn't satisfy any of the above conditions then return "-1"

    @Test
    public void testIsMMultiple35HappyPath(){
        int m = 30;
        String expectedResult = "Good Number";

        IsMMultiple35 isMMult = new IsMMultiple35();
        String actualResult = isMMult.isMMultiple35(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsMMultiple3HappyPath(){
        int m = 9;
        String expectedResult = "Bad Number";

        IsMMultiple35 isMMult = new IsMMultiple35();
        String actualResult = isMMult.isMMultiple35(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsMMultiple5HappyPath(){
        int m = 25;
        String expectedResult = "Poor Number";

        IsMMultiple35 isMMult = new IsMMultiple35();
        String actualResult = isMMult.isMMultiple35(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsMMultipleAnyHappyPath(){
        int m = 4;
        String expectedResult = "-1";

        IsMMultiple35 isMMult = new IsMMultiple35();
        String actualResult = isMMult.isMMultiple35(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsMMultipleZeroHappyPath(){
        int m = 0;
        String expectedResult = "Good Number";

        IsMMultiple35 isMMult = new IsMMultiple35();
        String actualResult = isMMult.isMMultiple35(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsMMultiple35NegativeNumHappyPath(){
        int m = -30;
        String expectedResult = "Good Number";

        IsMMultiple35 isMMult = new IsMMultiple35();
        String actualResult = isMMult.isMMultiple35(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}



import org.junit.jupiter.api.*;

public class ReverseStringTests {

    @Test
    public void testReverseStringHappyPath(){
        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";
        
        ReverseString revStr = new ReverseString();
        String actualResult = revStr.reverseString(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}

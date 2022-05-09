

import org.junit.jupiter.api.*;

public class ReverseStringTests {

    @Test
    public void String testReverseStringHappyPath(){
        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";
        
        ReverseString revStr = new ReverseString();
        StringactualResult = revStr.reverseString(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}

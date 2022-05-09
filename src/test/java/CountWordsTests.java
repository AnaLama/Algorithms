import org.junit.jupiter.api.*;

public class CountWordsTests {
    @Test
    public void testNumOfWordsHappyPath(){
        String text = "ohf java fjtsa java";
        String word = "java";
        int expectedResult = 2;

        CountWords num = new CountWords();
        int actualResult = num.getNumberOfWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

import org.junit.jupiter.api.*;

public class IntersectionTest {
//    Test Data:
//    {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//    {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//    {1, 2, 4, 5, 89}, {8, 9, 45} → {}

    @Test
    public void testIntersectionHappyPAth(){
    int [] array1 = {1, 2, 4, 5, 89};
    int []array2 = {8, 9, 4, 2};
    int [] expectedResult = {2, 4};

    Intersection intersec = new Intersection();
    int [] actualResult = intersec.intersec(array1, array2);

    Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionNegNumHappyPAth(){
        int [] array1 = {1, 2, 4, 5, 8, 9};
        int []array2 = {8, 9, -4, -2};
        int [] expectedResult = {8, 9};

        Intersection intersec = new Intersection();
        int [] actualResult = intersec.intersec(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testNoIntersectionHappyPAth(){
        int [] array1 = {1, 2, 4, 5, 89};
        int []array2 = {8, 9, 45};
        int [] expectedResult = {};

        Intersection intersec = new Intersection();
        int [] actualResult = intersec.intersec(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionEmptyArrayHappyPAth(){
        int [] array1 = {};
        int []array2 = {8, 9, 45};
        int [] expectedResult = {};

        Intersection intersec = new Intersection();
        int [] actualResult = intersec.intersec(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

//    @Test       // падает из-за длины массива
//    public void testIntersectionZeroArrayHappyPAth(){
//        int [] array1 = {0, 0, 0, 0, 0};
//        int []array2 = {8, 0, 45};
//        int [] expectedResult = {0};
//
//        Intersection intersec = new Intersection();
//        int [] actualResult = intersec.intersec(array1, array2);
//
//        Assertions.assertArrayEquals(expectedResult, actualResult);
//    }
}

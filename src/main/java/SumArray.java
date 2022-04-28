public class SumArray {
//Написать алгоритм SumArray, который возвращает сумму всех чисел массива

    public int sumArray(int[]array) {
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
        return 0;
    }
}

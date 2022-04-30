public class MinMaxAve {
//8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов. Алгоритм возвращает массив,
// который содержит минимальное значение, максимальное значение,  и среднее среди всех значений между 2-мя индексами.

    public double[] minMaxAve(int[] array, int ind1, int ind2) {
        if (array.length > 0 && ind1 < ind2 && ind1 >= 0) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            double aver = 0;
            double[] minMaxAvArray = new double[]{min, max, aver};

            for (int i = ind1; i <= ind2; i++) {
                sum += array[i];
                aver = sum / ((ind2 - ind1) + 1);
                minMaxAvArray[2] = aver;
                if (array[i] < min) {
                    min = array[i];
                    minMaxAvArray[0] = min;
                } else if (array[i] > max) {
                    max = array[i];
                    minMaxAvArray[1] = max;
                }
            }
            return minMaxAvArray;
        } else
            return null;
    }
}




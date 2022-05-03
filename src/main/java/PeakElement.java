public class PeakElement {
    //   Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения пиковых элементов
    //           (элементы, которые больше своих соседей).
    public int[] peakElement(int[] array) {
        int[] peakElement = new int[]{};
        if (array.length > 0 && array != null) {
            int count = 0;
            if (array[0] > array[1]) {
                count++;
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                count++;
            }
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    count++;
                }
            }
            peakElement = new int[count];
            count = 0;
            if (array[0] > array[1]) {
                peakElement[0] = array[0];
                count++;
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                peakElement[peakElement.length - 1] = array[array.length - 1];
            }
            for (int i = 1; i < array.length - 1; i++) {

                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    peakElement[count] = array[i];
                    count++;
                }
            }
        }
        return peakElement;
    }
}

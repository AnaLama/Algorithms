public class Intersection {
    //Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
    public int[] intersec(int[] array1, int[] array2) {
        if (array1.length > 0 && array2.length > 0) {
            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        count++;
                    }
                }
            }
            int[] intersec = new int[count];
            count = 0;
            for (int i = 0; i < array1.length; i++){
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        intersec[count] = array1[i];
                        count++;
                    }
                }

            }


            return intersec;
        }
        return new int []{};
    }
        }

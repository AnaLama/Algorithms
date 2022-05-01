public class OddIndices {
// Написать алгоритм OddIndices, который принимает массив чисел
//,  и возвращает массив значений нечетных индексов

    public int [] getOddIndices(int []array){
        if(array.length > 0){
//            int count = 0;
//            for(int i = 1; i < array.length; i += 2){
//                count++;
//            }
            int []oddIndices = new int[array.length / 2];
           int count = 0;
            for(int i = 1; i < array.length; i +=2){
                oddIndices[count] = array[i];
                count ++;
            }
            return oddIndices;
        } else

            return new int []{};
    }



}

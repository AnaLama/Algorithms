public class ReverseArray {
    public  int [] getReverseArray(int [] array) {
        int [] newArray = new int[array.length];
        int ind = array.length - 1;
        for (int i = 0; i < array.length; i++){
            newArray[ind] = array[i];
            ind --;
        }
        return newArray;
    }
}

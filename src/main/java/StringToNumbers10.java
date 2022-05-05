public class StringToNumbers10 {
// Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:

    public int[] stringToNum(String str) {
        str = str.replaceAll(",", "");
        String[] str1 = str.split(" ");
        int[] strNum = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            strNum[i] = Integer.parseInt(str1[i]);
        }
        return strNum;
    }
}

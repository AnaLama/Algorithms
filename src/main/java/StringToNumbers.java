public class StringToNumbers {
    public static String getNumbers (String str){
        if (str.length() != 0 || str != null){
            str = str.replaceAll("[^0-9, - .]", "");
            return str;
        }
        return null;
    }
}

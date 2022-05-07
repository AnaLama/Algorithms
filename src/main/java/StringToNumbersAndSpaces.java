public class StringToNumbersAndSpaces {
    public static String getNumSpace (String str){
        if (str.length() != 0 || str != null){
            str = str.replaceAll("[^0-9, ' ']", "");
            return str;
        }
        return null;
    }
}

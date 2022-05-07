public class StringToLettersAndSpace {
    public static String getLetters (String str){
        if (str.length() != 0 || str != null){
            str = str.replaceAll("[^A-Za-z, ' ']", "");
            return str;
        }
        return null;
    }
}

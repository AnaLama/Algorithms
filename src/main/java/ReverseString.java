public class ReverseString {
    public String reverseString (String str){
        if (str.length() != 0) {
            int length = str.length();
            String reverseStr = "";
            for (int i = 0; i < str.length(); i++){
          //      String reverseStr = "";
                reverseStr = str.charAt(i) + reverseStr;
            }
            return reverseStr;
        }
        return null;
    }
}

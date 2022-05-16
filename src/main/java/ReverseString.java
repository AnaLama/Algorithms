public class ReverseString {
    public String reverseString(String str) {
        if (str != null && str.length() != 0) {
            String reverseStr = "";
            for (int i = 0; i < str.length(); i++) {
                reverseStr = str.charAt(i) + reverseStr;
            }
            return reverseStr;
        }
        return "Error";
    }
}

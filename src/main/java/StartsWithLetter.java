public class StartsWithLetter {
    public static String getLWords (String text){
        String [] words = text.split(" ");
        String lText = "";
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[i].length(); j++){
            if (words[i].substring(0, 1).equals("l")){
                  lText = lText + words[i];
                

            }}
        }
        return lText;
    }

    public static void main(String[] args) {
        System.out.println(getLWords("I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n"));
    }
}

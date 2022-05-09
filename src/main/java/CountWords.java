public class CountWords {
// Напишите алгоритм CountWords, который принимает на вход текст и слово,  и считает все вариации этого слова в тексте
public static int getNumberOfWords(String text, String word){
    text = text.toLowerCase();
    int count = 0;
    String str = "";

//    for (int i = 0; i < text.length(); i++){
//        if (text.charAt(i) == 'j') {
//            str += text.substring(i, i+4);
//            }}
        for (int j = 0; j < text.length(); j ++){
        if (text.substring(j, j+4) == "java"){
            count++;}

    }

    return count;
}
}

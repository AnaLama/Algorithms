public class CountWords {
    // Напишите алгоритм CountWords, который принимает на вход текст и слово,  и считает все вариации этого слова в тексте
    public static int getNumberOfWords(String text, String word) {
        text = text.toLowerCase();
        int count = 0;
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[, .]", "");
            if (words[i].equals(word)) {
                count++;
            }
        }
        return count;
    }
}

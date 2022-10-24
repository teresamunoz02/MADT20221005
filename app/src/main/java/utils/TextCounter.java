package utils;

public class TextCounter {
    public static String getCharsCount(String input){
        return String.valueOf(input.length());
    }
    public static int countWordsUsingSplit(String input){
        String[] words = input.split("\\s+");
        return words.length;
    }
}

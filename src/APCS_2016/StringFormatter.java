package APCS_2016;

import java.util.ArrayList;

public class StringFormatter {
    public static int totalLetters(ArrayList<String> wordList) {
        int count = 0;
        for (String str:
             wordList) {
            count += str.length();
        }
        return count;
    }

    public static int basicGapWidth(ArrayList<String> wordList, int formattedLen) {
        return (formattedLen - totalLetters(wordList))/(wordList.size() - 1);
    }

    // this method is not required in the test.
    public static int leftoverSpaces(ArrayList<String> wordList, int formattedLen) {
        return (formattedLen - totalLetters(wordList) - basicGapWidth(wordList, formattedLen) * (wordList.size() - 1));
    }

    public static String format(ArrayList<String> wordList, int formattedLen) {
        String str = "";
        // leftover counter
        int leftOver = leftoverSpaces(wordList, formattedLen);
        // make the gap
        String gap = "";
        for (int i = 0; i < basicGapWidth(wordList, formattedLen); i++)
            gap += " ";
        // make the string
        for (String word: wordList) {
            str += word;
            str += gap;
            // insert leftover
            if (leftOver > 0) {
                str += " ";
                leftOver--;
            }
        }
        return str;
    }


}


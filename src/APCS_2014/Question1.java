package APCS_2014;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("ABRACADABRA"));
        System.out.println(scrambleWord("WHOA"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("EGGS"));
        System.out.println(scrambleWord("A"));

        String[] strings = {"TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"};
        ArrayList<String> strs = new ArrayList<String>();
        for (String str:
             strings) {
            strs.add(str);
        }
        scrambleOrRemove(strs);

        for (String str:
             strs) {
            System.out.println(str);
        }

    }

    public static String scrambleWord(String word) {
        String str = "";
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.substring(i, i+1).equals("A") && !word.substring(i+1, i+2).equals("A")) {
                str += word.substring(i+1, i+2) + "A";
                i++;
            }
            else {
                str += word.substring(i, i+1);
            }
        }
        // if the last two isn't swapped, add the last one
        if (str.length() < word.length())
            str += word.substring(word.length()-1);
        return str;
    }

    public static void scrambleOrRemove(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            String temp = wordList.get(i);
            if (temp.equals(scrambleWord(temp))) {
                wordList.remove(i);
                i--;
            }
        }
    }
}

package APCS_2016;

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> wordArray;

    public RandomStringChooser(String[] arr) {
        wordArray = new ArrayList<String>();
        for (String str: arr) {
            wordArray.add(str);
        }
    }

    public String getNext() {
        // when it's empty
        if (wordArray.size() == 0)
            return "NONE";

        // the generated index
        int index = (int) (Math.random() * wordArray.size());

        // get the string, and delete it in wordArray
        return wordArray.remove(index);
    }

    // testing method

    public ArrayList<String> getWordArray() {
        return wordArray;
    }
}

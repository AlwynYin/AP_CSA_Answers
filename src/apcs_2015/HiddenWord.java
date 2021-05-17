package apcs_2015;

public class HiddenWord {
    private String myHiddenWord;

    public HiddenWord(String hiddenWord) {
        myHiddenWord = hiddenWord;
    }

    public String getHint(String str) {
        String hint = "";
        for (int i = 0; i < myHiddenWord.length(); i++) {
            // exactly i position
            if (myHiddenWord.indexOf(str.substring(i, i+1)) == i)
                hint += myHiddenWord.substring(i, i+1);
            // in the string
            else if (myHiddenWord.indexOf(str.substring(i, i+1)) != -1)
                hint += "+";
            // not included
            else
                hint += "*";
        }
        return hint;
    }
}

package APCS_2018;

public class WordPair {
    private String firstWord;
    private String secondWord;

    public WordPair(String first, String second) {
        firstWord = first;
        secondWord = second;
    }

    public String getFirst() {
        return firstWord;
    }

    public String getSecond() {
        return secondWord;
    }

    // testing method
    public String toString() {
        return "( " + firstWord + ", " + secondWord + " )";
    }
}

package APCS_2018;

public class WordPairListMain {
    public static void main(String[] args) {
        // a ex.2
        String[] strArr = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(strArr);
        System.out.println(exampleTwo);

        // b ex.3
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree);
        System.out.println(exampleThree.numMatches());
    }
}

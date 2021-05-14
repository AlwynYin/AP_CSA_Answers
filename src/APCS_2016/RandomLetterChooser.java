package APCS_2016;

public class RandomLetterChooser extends RandomStringChooser{
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    // This method is not required in the test.
    public static String[] getSingleLetters(String str) {
        String[] strings = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strings[i] = str.substring(i, i+1);
        }
        return strings;
    }

    public String toString() {
        String str = "";
        for (String each:
             getWordArray()) {
            str += each + " ";
        }
        return str;
    }
}

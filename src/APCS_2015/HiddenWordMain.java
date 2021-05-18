package APCS_2015;

public class HiddenWordMain {
    public static void main(String[] args) {
        HiddenWord word = new HiddenWord("HARPS");
        System.out.println(word.getHint("AAAAA"));
        System.out.println(word.getHint("HELLO"));
        System.out.println(word.getHint("HEART"));
        System.out.println(word.getHint("HARMS"));
        System.out.println(word.getHint("HARPS"));
    }
}

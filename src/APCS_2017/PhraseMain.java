package APCS_2017;

public class PhraseMain {
    public static void main(String[] args) {
        Phrase phrase1 = new Phrase("A cat ate late.");
        System.out.println(phrase1);
        phrase1.replaceNthOccurrence("at", 1, "rane");
        System.out.println(phrase1);
        Phrase phrase2 = new Phrase("A cat ate late.");
        System.out.println(phrase2.findLastOccurrence("at"));
        System.out.println(phrase2.findLastOccurrence("cat"));
    }
}

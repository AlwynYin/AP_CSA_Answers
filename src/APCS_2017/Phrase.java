package APCS_2017;

public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n) {
        int count = 0;
        for (int i = 0; i < currentPhrase.length() - str.length(); i++) {
            if (currentPhrase.substring(i, i+str.length()).equals(str))
                count++;
            if (count == n)
                return i;
        }
        return -1;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        int index = findNthOccurrence(str, n);
        // get the substring before and after
        String pref = currentPhrase.substring(0, index);
        String suff = currentPhrase.substring(index+str.length());
        currentPhrase = pref + repl + suff;
    }

    public int findLastOccurrence(String str) {
        // str isn't in currentPhrase
        int index = -1;
        int i = 1;
        // find the last time
        while (findNthOccurrence(str, i) != -1) {
            index = findNthOccurrence(str, i);
            i++;
        }
        return index;
    }

    public String toString() {
        return currentPhrase;
    }
}

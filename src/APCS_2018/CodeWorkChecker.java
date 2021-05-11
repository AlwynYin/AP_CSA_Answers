package APCS_2018;

public class CodeWorkChecker implements StringChecker {
    private int minLen;
    private int maxLen;
    private String falseStr;

    public CodeWorkChecker(int min, int max, String str) {
        minLen = min;
        maxLen = max;
        falseStr = str;
    }

    public CodeWorkChecker(String str) {
        minLen = 6;
        maxLen = 20;
        falseStr = str;
    }

    public boolean isValid(String str) {
        // check length
        if (str.length() > maxLen || str.length() < minLen)
            return false;

        for (int i = 0; i < str.length() - falseStr.length(); i++) {
            if (str.substring(i, i+falseStr.length()).equals(falseStr))
                return false;
        }
        return true;
    }
}

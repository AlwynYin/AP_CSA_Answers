package APCS_2008;

public class SubstringChecker implements Checker{
    private String substring;

    public SubstringChecker(String str) {
        substring = str;
    }

    @Override
    public boolean accept(String text) {
        for (int i = 0; i < text.length() - substring.length()+1; i++) {
            if (text.substring(i, i + substring.length()).equals(substring))
                return true;
        }
        return false;
    }
}

package APCS_2019;
// just self-talking: based on this file, i made a mathematical expression calculator
import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimiterList(String[] tokens) {
        ArrayList<String> delis = new ArrayList<String>();
        for (String str: tokens) {
            if (str.equals(openDel) || str.equals(closeDel)) {
                delis.add(str);
            }
        }
        return delis;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        for (String str:
             delimiters) {
            if (str.equals(openDel))
                openCount++;
            else
                closeCount++;
            if (closeCount > openCount)
                return false;
        }
        return openCount == closeCount;
    }
}

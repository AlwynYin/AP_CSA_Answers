package APCS_2016;

import java.util.ArrayList;
import java.util.Arrays;

public class StringFormatterMain {
    public static void main(String[] args) {
        String[] l1 = new String[]{"A", "Frog", "is"};
        // DO NOTICE THAT THIS ALGORITHM IS NOT ALLOWED IN AP CSA
        ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(l1));
        System.out.println(StringFormatter.totalLetters(a1));

        System.out.println(StringFormatter.basicGapWidth(a1, 20));
        System.out.println(StringFormatter.format(a1, 20));
    }
}

package APCS_2019;

import java.util.ArrayList;

public class DelimitersMain {
    public static void main(String[] args) {
        //example 1 of a
        Delimiters delimiters1 = new Delimiters("(", ")");
        String[] tokens = {"(", "x + y", ")", " * 5"};
        ArrayList<String> delList1 = delimiters1.getDelimiterList(tokens);
        printArrList(delList1);

        //example 1, 3 of b
        Delimiters delimiters2 = new Delimiters("<sup>", "</sup>");
        ArrayList<String> b1 = new ArrayList<String>();
        b1.add("<sup>");
        b1.add("<sup>");
        b1.add("</sup>");
        b1.add("<sup>");
        b1.add("</sup>");
        b1.add("</sup>");
        System.out.println(delimiters2.isBalanced(b1));
        ArrayList<String> b3 = new ArrayList<String>();
        b3.add("</sup>");
        System.out.println(delimiters2.isBalanced(b3));
    }

    public static void printArrList(Iterable arrayList) {
        for (Object obj:
             arrayList) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

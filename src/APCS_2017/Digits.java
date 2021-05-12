package APCS_2017;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        while (num > 0) {
            digitList.add(0, num % 10);// add the digit to the 0th place
            num /= 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        int previous = digitList.get(0);
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) <= previous)
                return false;
            previous = digitList.get(i);
        }
        return true;
    }

    // toString
    public String toString() {
        String str = "";
        for (Integer i: digitList) {
            str += i + " ";
        }
        return str;
    }
}

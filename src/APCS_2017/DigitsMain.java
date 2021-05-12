package APCS_2017;

public class DigitsMain {
    public static void main(String[] args) {
        Digits d1 = new Digits(15704);
        System.out.println(d1);

        Digits d2 = new Digits(1356);
        System.out.println(d2.isStrictlyIncreasing());
        Digits d3 = new Digits(1355);
        System.out.println(d3.isStrictlyIncreasing());
    }
}

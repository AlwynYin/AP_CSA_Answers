package APCS_2018;

public class CodeWorkCheckerMain {
    public static void main(String[] args) {
        StringChecker sc1 = new CodeWorkChecker(5, 8,"$");
        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));
    }
}

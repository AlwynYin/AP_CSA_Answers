package APCS_2008;

public class AndChecker implements Checker {
    private Checker a;
    private Checker b;

    public AndChecker(Checker aChecker, Checker bChecker) {
        a = aChecker;
        b = bChecker;
    }

    @Override
    public boolean accept(String text) {
        return a.accept(text) && b.accept(text);
    }
}

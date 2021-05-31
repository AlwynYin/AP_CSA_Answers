package APCS_2008;

public class NotChecker implements Checker{
    private Checker checker;

    public NotChecker(Checker newChecker) {
        checker = newChecker;
    }

    @Override
    public boolean accept(String text) {
        return !checker.accept(text);
    }
}

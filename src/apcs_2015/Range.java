package apcs_2015;

public class Range implements NumberGroup{
    private int myMin;
    private int myMax;

    public Range(int min, int max) {
        myMin = min;
        myMax = max;
    }

    @Override
    public boolean contains(int n) {
        return (n >= myMin && n <= myMax);
    }
}

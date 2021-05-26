package APCS_2010;

public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int newA, int newB, int newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    public double getSlope() {
        return (double) -a/b;
    }

    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
}

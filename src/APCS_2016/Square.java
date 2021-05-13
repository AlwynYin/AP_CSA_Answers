package APCS_2016;

public class Square {
    private boolean isBlack;
    private int num;

    public Square(boolean isBlack, int num) {
        this.isBlack = isBlack;
        this.num = num;
    }

    public String toString() {
        return "(" + isBlack + ", " + num + ")";
    }
}

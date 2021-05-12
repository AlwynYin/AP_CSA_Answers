package APCS_2017;
// this file is not required to write in the test.
public class Position {
    private int row;
    private int col;

    public Position(int r, int c) {
        row = r;
        col = c;
    }

    public String toString() {
        return "(" + row + ", " + col + ")";
    }
}

package APCS_2016;

public class CrossWord {
    private Square[][] puzzle;

    public CrossWord(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int count = 1;
        for (int row = 0; row < blackSquares.length; row++) {
            for (int col = 0; col < blackSquares[0].length; col++) {
                if (blackSquares[row][col])
                    puzzle[row][col] = new Square(true, 0);
                else if (tobeLabeled(row, col, blackSquares)) {
                    puzzle[row][col] = new Square(false, count);
                    count++;
                }
                else {
                    puzzle[row][col] = new Square(false, 0);
                }
            }
        }
    }

    private boolean tobeLabeled(int r, int c, boolean[][] blackSquares) {
        // is black
        if (blackSquares[r][c])
            return false;

        // at the left or top
        if (r == 0 || c == 0)
            return true;

        // at middle
        return blackSquares[r][c - 1] || blackSquares[r - 1][c];

    }

    public String toString() {
        String str = "";
        for (Square[] row:
             puzzle) {
            for (Square each:
                 row) {
                str += String.format("%-12s", each);
            }
            str += "\n";
        }
        return str;
    }
}

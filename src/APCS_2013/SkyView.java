package APCS_2013;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int count = 0;
        for (int row = 0; row < view.length; row++) {
            //even, from left to right
            if (row % 2 == 0) {
                for (int col = 0; col < view[0].length; col++) {
                    view[row][col] = scanned[count];
                    count++;
                }
            }
            //odd, from right to left
            else {
                for (int col = view[0].length - 1; col >= 0; col--) {
                    view[row][col] = scanned[count];
                    count++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double total = 0;
        int count = (endRow - startRow + 1) * (endCol - startCol + 1);
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                total += view[row][col];
            }
        }
        return total / count;
    }

    public String toString() {
        String str = "";
        for (double[] row: view) {
            for (double i: row) {
                str += i + " ";
            }
            str += "\n";
        }
        return str;
    }
}

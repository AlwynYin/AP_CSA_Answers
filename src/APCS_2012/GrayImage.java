package APCS_2012;

public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    private int[][] pixelValues;

    public GrayImage(int[][] values) {
        pixelValues = values;
    }

    public int countWhitePixels() {
        int count = 0;
        for (int[] row: pixelValues) {
            for (int n: row) {
                if (n == WHITE)
                    count++;
            }
        }
        return count;
    }

    public void processImage() {
        for (int row = 0; row < pixelValues.length - 2; row++) {
            for (int col = 0; col < pixelValues[0].length - 2; col++) {
                pixelValues[row][col] -= pixelValues[row + 2][col + 2];
                if (pixelValues[row][col] < BLACK)
                    pixelValues[row][col] = BLACK;
            }
        }
    }

    public String toString() {
        String str = "";
        for (int[] row: pixelValues) {
            for (int n: row) {
                str += String.format("%-4d", n);
            }
            str += "\n";
        }
        str = str.substring(0, str.length() - 1);
        return str;
    }
}

package APCS_2019;
// This class has not been strictly tested.
public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        boolean lit;
        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                lit = (int) (Math.random() * 10) < 4;
                lights[r][c] = lit;
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        // 1
        int litCount = 0;
        if (lights[row][col]) {
            for (int c = 0; c < lights.length; c++) {
                if (lights[row][c])
                    litCount++;
            }
            if (litCount % 2 == 0)
                return false;
        }
        // 2
        else {
            for (int c = 0; c < lights.length; c++) {
                if (lights[row][c])
                    litCount++;
            }
            if (litCount % 3 == 0)
                return true;
        }
        // 3
        return lights[row][col];
    }

    // testing method
    public String toString() {
        String str = "";
        for (boolean[] row: lights) {
            for (boolean each: row) {
                str += each + " ";
            }
            str += "\n";
        }
        return str;
    }
}

package APCS_2016;

public class CrossWordMain {
    public static void main(String[] args) {
        boolean[][] black = new boolean[7][9];
        for (int i = 0; i < black.length; i++) {
            for (int j = 0; j < black[0].length; j++) {
                black[i][j] = false;
            }
        }
        black[0][0] = true;
        black[0][3] = true;
        black[0][4] = true;
        black[0][5] = true;
        black[1][4] = true;
        black[2][6] = true;
        black[2][7] = true;
        black[2][8] = true;
        black[3][2] = true;
        black[3][6] = true;
        black[4][0] = true;
        black[4][1] = true;
        black[4][2] = true;
        black[5][4] = true;
        black[6][3] = true;
        black[6][4] = true;
        black[6][5] = true;
        black[6][8] = true;

        CrossWord c = new CrossWord(black);
        System.out.print(c);
    }
}

package APCS_2011;

public class RouteCipher {
    private String[][] letterBlock;
    private int numRows;
    private int numCols;

    public RouteCipher(int rows, int cols) {
        numRows = rows;
        numCols = cols;
        letterBlock = new String[numRows][numCols];
    }

    private void fillBlock(String str) {
        int count = 0;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (count < str.length()) {
                    letterBlock[row][col] = str.substring(count, count+1);
                }
                else {
                    letterBlock[row][col] = "A";
                }
                count++;
            }
        }
    }

    private String encryptBlock() {
        String str = "";
        for (int col = 0; col < letterBlock[0].length; col++) {
            for (int row = 0; row < letterBlock.length; row++) {
                str += letterBlock[row][col];
            }
        }
        return str;
    }

    public String encryptMessage(String message) {
        int length = numRows * numCols; // the length of each encryption
        String encrypted = "";
        // full encryption
        while (message.length() >= length) {
            // encrypt and delete
            fillBlock(message.substring(0, length));
            encrypted += encryptBlock();
            message = message.substring(length);
        }
        // last few characters that are lesser than the size of block
        fillBlock(message);
        encrypted += encryptBlock();
        return encrypted;
    }
}

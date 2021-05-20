package APCS_2013;

public class TokenPass {
    public int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        currentPlayer = (int)(Math.random() * playerCount);
        // give names to each
        for (int i = 0; i < board.length; i++) {
            board[i] = (int)(Math.random() * 10) + 1;
        }
    }

    public int getCurrentPlayer() {return currentPlayer;}

    public void distributeCurrentPlayerTokens() {
        //collecting
        int temp = board[currentPlayer];
        board[currentPlayer] = 0;

        int position = currentPlayer; // distributing to this position
        while (temp > 0) {
            // get the next position
            if (position >= board.length - 1)
                position = 0;
            else
                position++;

            // distribute coin
            board[position]++;
            temp--;
        }

    }

    public String toString() {
        String str = "";
        for (int i:
                board) {
            str += i + " ";
        }
        return str;
    }

}

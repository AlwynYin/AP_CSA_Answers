package APCS_2009;

import java.util.ArrayList;

public class TileGame {
    private ArrayList<NumberTile> board;

    public TileGame(ArrayList<NumberTile> tiles) {
        board = tiles;
    }

    public int getIndexForFit(NumberTile tile) {
        // very front
        if (tile.getRight() == board.get(0).getLeft())
            return 0;
        //middle
        for (int j = 0; j < board.size()-1; j++) {
            if (tile.getLeft() == board.get(j).getRight() && tile.getRight() == board.get(j).getLeft())
                return j + 1;
        }
        //very end
        if (tile.getLeft() == board.get(board.size() - 1).getRight())
            return board.size();
        return -1;
    }

    public boolean insertTile (NumberTile tile) {
        for (int i = 0; i < 4; i++) {
            if (getIndexForFit(tile) != -1) {
                board.add(getIndexForFit(tile), tile);
                return true;
            }
            tile.rotate();
        }
        return false;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < board.size(); i++)
        {
            str += board.get(i).getLeft() + " ";
            str += board.get(i).getRight() + ", ";
        }
        return str;
    }
}

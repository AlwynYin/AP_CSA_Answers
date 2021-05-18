package APCS_2015;

import java.util.ArrayList;

public class SparseArray {
    private int numRows;
    private int numCols;
    private ArrayList<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }

    public SparseArray(int r, int c, ArrayList<SparseArrayEntry> entries) {
        numRows = r;
        numCols = c;
        this.entries = entries;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getValueAt(int row, int col) {
        for (SparseArrayEntry entry:
             entries) {
            if (entry.getRow() == row && entry.getCol() == col)
                return entry.getValue();
        }
        return 0;
    }

    public void removeColumn(int col) {
        numCols--;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getCol() == col) {
                entries.remove(i);
                i--;
            }
        }
    }
}

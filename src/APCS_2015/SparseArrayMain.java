package APCS_2015;

import java.util.ArrayList;

public class SparseArrayMain {
    public static void main(String[] args) {
        ArrayList<SparseArrayEntry> entries = new ArrayList<SparseArrayEntry>();
        entries.add(new SparseArrayEntry(1, 1, 5));
        entries.add(new SparseArrayEntry(1, 4, 4));
        entries.add(new SparseArrayEntry(2, 0, 1));
        entries.add(new SparseArrayEntry(3, 1, -9));
        SparseArray sparseArray = new SparseArray(6, 5, entries);
        System.out.println(sparseArray.getValueAt(3, 1));
        System.out.println(sparseArray.getValueAt(3, 3));

        sparseArray.removeColumn(1);
        System.out.println(sparseArray.getNumCols());
        System.out.println(sparseArray.getValueAt(1, 1));
    }
}

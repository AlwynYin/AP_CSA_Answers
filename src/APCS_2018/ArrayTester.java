package APCS_2018;

import java.util.ArrayList;

public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] col = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            col[i] = arr2D[i][c];
        }
        return col;
    }

    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean hasAllValue(int[] arr1, int[] arr2) {
        // copy arr2 into arrayList
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i: arr2) {
            tmp.add(i);
        }

        // check, if appears, delete
        for (int i: arr1) {
            if (tmp.contains(i)) {
                Integer integer = i;
                tmp.remove(integer);
            }
            else
                return false;
        }
        return true;
    }

    public static boolean isLatin(int[][] square) {
        // contains duplicate
        if (containsDuplicates(square[0]))
            return false;

        // has all value
        for (int i = 0; i < square[0].length; i++) {
            if (!hasAllValue(getColumn(square, i), square[0]))
                return false;
        }
        return true;
    }
}

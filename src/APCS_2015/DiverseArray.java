package APCS_2015;

public class DiverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 3};
        System.out.println(arraySum(arr1));
        int[][] mat1 = {
                {1,3,2,7,3},
                {10,10,4,6,2},
                {5,3,5,9,6},
                {7,6,4,2,1}
        };
        int[] sum1 = rowSum(mat1);
        for (int i:
             sum1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(isDiverse(mat1));
        int[][] mat2 = {
                {1, 1, 5, 3, 4},
                {12,7,6,1,9},
                {8,11,10,2,5},
                {3,2,3,0,6}
        };
        System.out.println(isDiverse(mat2));

    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int n:
             arr) {
            sum += n;
        }
        return sum;
    }

    public static int[] rowSum(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            sums[i] = arraySum(arr2D[i]);
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        // get the row sum
        int[] sums = rowSum(arr2D);
        for (int i = 0; i < sums.length; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] == sums[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

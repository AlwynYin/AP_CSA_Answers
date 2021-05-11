package APCS_2018;

public class ArrayTesterMain {
    public static void main(String[] args) {
        int[][] arr2D = {
                {0,1,2},
                {3,4,5},
                {6,7,8},
                {9,5,3}
        };
        int[] result = ArrayTester.getColumn(arr2D, 1);
        printArr(result);
        System.out.println(); //print a blank line, easier to see

        //test hasAllValues
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,3,5};
        System.out.println(ArrayTester.hasAllValue(arr2, arr1));
        System.out.println(ArrayTester.hasAllValue(arr3, arr1));
        System.out.println();

        //test containsDuplicates
        System.out.println(ArrayTester.containsDuplicates(arr1));
        System.out.println(ArrayTester.containsDuplicates(arr3));
        System.out.println();

        // islatin
        int[][] latin = {
                {10, 30, 20, 0},
                {0, 20, 30, 10},
                {30, 0, 10, 20},
                {20, 10, 0, 30}
        };
        System.out.println(ArrayTester.isLatin(latin));
        int[][] nonLatin = {
                {1,2,1},
                {2,1,1},
                {1,1,2}
        };
        System.out.println(ArrayTester.isLatin(nonLatin));
    }

    public static void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

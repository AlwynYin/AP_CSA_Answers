package APCS_2017;
// both the methods and testing class
public class Question4 {
    public static void main(String[] args) {
        int[][] arr = {
                {15, 5, 9, 10},
                {12, 16, 11, 6},
                {14, 8, 13, 7}
        };
       //a
       System.out.println(findPosition(8, arr));
       System.out.println(findPosition(17, arr));
       Position[][] successor = getSuccessorArray(arr);
        for (Position[] row: successor) {
            for (Position p: row) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    public static Position findPosition(int num, int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (intArr[i][j] == num)
                    return new Position(i, j);
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] successor = new Position[intArr.length][intArr[0].length];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                successor[i][j] = findPosition(intArr[i][j]+1, intArr);
            }
        }
        return successor;
    }
}

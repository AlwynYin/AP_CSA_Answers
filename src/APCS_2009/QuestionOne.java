package APCS_2009;

public class QuestionOne {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            NumberCube cube1 = new NumberCube();
            int[] result1 = getCubeTosses(cube1, 18);
            for (int each : result1)
                System.out.print(each + " ");
            System.out.println();
            System.out.println(getLongestRun(result1));
        }
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] results = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            results[i] = cube.toss();
        }
        return results;
    }

    public static int getLongestRun(int[] values) {
        int lengthOfRun = 0;
        int longest = 1;
        int maxLocation = -1;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i+1]) {// start of run
                int endOfRun = i + 1;
                while (endOfRun < values.length && values[endOfRun] == values[i])
                    endOfRun++;
                // endOfRun will be the first index out of the run
                lengthOfRun = endOfRun - i;
                if (lengthOfRun > longest) {
                    longest = lengthOfRun;
                    maxLocation = i;
                }
                i = endOfRun;// put the loop in end of run
            }
        }
        return maxLocation;
    }
}

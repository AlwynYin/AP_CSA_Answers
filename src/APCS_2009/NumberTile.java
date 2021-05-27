package APCS_2009;

public class NumberTile {
    // an array is used to represent the numbers starting from top position, counting clockwise
    // for example, numbers[0] is the top, numbers[1] is the right
    private int[] numbers;

    public NumberTile(int top, int right, int down, int left) {
        numbers = new int[4];
        numbers[0] = top;
        numbers[1] = right;
        numbers[2] = down;
        numbers[3] = left;
    }

    public NumberTile(int[] numbers) {
        this.numbers = numbers;
    }

    public void rotate() {
        int temp = numbers[3];
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = temp;
    }

    public int getLeft() {
        return numbers[3];
    }

    public int getRight() {
        return numbers[1];
    }

    public String toString() {
        String str = "";
        str += String.format("%3s\n", numbers[0]);
        str += numbers[3] + "   " + numbers[1];
        str += String.format("\n%3s", numbers[2]);
        return str;
    }
}

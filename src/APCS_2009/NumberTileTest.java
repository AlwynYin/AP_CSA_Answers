package APCS_2009;

public class NumberTileTest {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 7, 4};
        NumberTile numberTile = new NumberTile(numbers);
        System.out.println(numberTile);
        for (int i = 0; i < 4; i++){
            numberTile.rotate();
            System.out.println(numberTile);
        }
    }
}

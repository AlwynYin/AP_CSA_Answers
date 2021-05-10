package APCS_2019;

public class LightBoardMain {
    public static void main(String[] args) {
        LightBoard lightBoard1 = new LightBoard(15, 15);
        System.out.println(lightBoard1);
        System.out.println(lightBoard1.evaluateLight(0,3));
    }
}

package APCS_2013;

public class TokenPassMain {
    public static void main(String[] args) {
        // i'm not so sure that this class has been tested.
        for (int i = 0; i < 10; i++){
            TokenPass pass = new TokenPass(4);
            System.out.println(pass);
            System.out.println("Current player: " + pass.getCurrentPlayer());
            pass.distributeCurrentPlayerTokens();
            System.out.println(pass);
        }
    }
}

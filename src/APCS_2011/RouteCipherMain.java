package APCS_2011;

public class RouteCipherMain {
	public static void main(String[] args)
	{
		RouteCipher cipher1 = new RouteCipher(2, 3);
		System.out.println(cipher1.encryptMessage("Meet at midnight"));
	}
}

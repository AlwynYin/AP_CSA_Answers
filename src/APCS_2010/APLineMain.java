package APCS_2010;

public class APLineMain {
	public static void main(String[] args)
	{
		APLine line1 = new APLine(5, 4, -17);
		System.out.println(line1.getSlope());
		System.out.println(line1.isOnLine(5, -2));
		
		APLine line2 = new APLine(-25, 40, 30);
		System.out.println(line2.getSlope());
		System.out.println(line2.isOnLine(5, -2));
	}
}

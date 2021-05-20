package APCS_2013;

public class SkyViewMain {
	public static void main(String[] args)
	{
		double[] scanned = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
		SkyView view1 = new SkyView(4, 3, scanned);
		System.out.println(view1);
		
		double[] scanned2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
		SkyView view2 = new SkyView(3, 2, scanned2);
		System.out.println(view2);
		
		System.out.println(view1.getAverage(1, 2, 0, 1));
	}
}

package APCS_2010;

public class TrailMain {
	public static void main(String[] args)
	{
		int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		Trail trail1 = new Trail(markers);
		System.out.println(trail1.isLevelTrailSegment(7, 10));
		System.out.println(trail1.isLevelTrailSegment(2, 12));
		
		System.out.println(trail1.isDifficult());
	}
}

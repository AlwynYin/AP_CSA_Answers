package APCS_2012;

public class GrayImageMain {
	public static void main(String[] args)
	{	int[][] values = {
				{255, 184, 178, 84, 129},
				{84, 255, 255, 130, 84},
				{78, 255, 0, 0, 78},
				{84, 130, 255, 130, 84},
		};
		
		GrayImage image1 = new GrayImage(values);
		System.out.println(image1);
		System.out.println(image1.countWhitePixels());
		
		int[][] values2 = {
				{221, 184, 178, 84, 135},
				{84, 255, 255, 130, 84},
				{78, 255, 0, 0, 78},
				{84, 130, 255, 130, 84},
		};
		
		GrayImage image2 = new GrayImage(values2);
		image2.processImage();
		System.out.println(image2);
	}
	
}

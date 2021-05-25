package APCS_2011;

public class SoundMain {
	public static void main(String[] args)
	{
		int[] sounds = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
		Sound sound1 = new Sound(sounds);
		int numChange = sound1.limitAmplitude(2000);
		System.out.println(sound1);
		System.out.println(numChange);
		
		
		int[] sounds2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
		Sound sound2 = new Sound(sounds2);
		sound2.trimSilenceFromBeginning();
		System.out.println(sound2);
	}
}

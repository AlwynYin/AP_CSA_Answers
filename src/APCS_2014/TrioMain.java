package APCS_2014;

import java.text.DecimalFormat;

public class TrioMain {
	public static void main(String[] args)
	{
		Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
		Sandwich clubSandwich = new Sandwich("Club Sandwich", 2.75);
		Salad spinachSalad = new Salad("Spinach Salad", 1.25);
		Salad coleslaw = new Salad("Coleslaw", 1.25);
		Drink orangeSoda = new Drink("Orange Soda", 1.25);
		Drink cappuccino = new Drink("Cappuccino", 3.50);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		Trio trio = new Trio(cheeseburger, spinachSalad, orangeSoda);
		Trio trio2 = new Trio(clubSandwich, coleslaw, cappuccino);
		System.out.println(trio.getName());
		System.out.println(df.format(trio.getPrice()));
		System.out.println(trio2.getName());
		System.out.println(trio2.getPrice());
	}
}

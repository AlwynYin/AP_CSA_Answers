package APCS_2014;

public class Drink implements MenuItem{

	private String myName;
	private double myPrice;
	
	public Drink(String name, double price)
	{
		myName = name;
		myPrice = price;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public double getPrice()
	{
		return myPrice;
	}
}

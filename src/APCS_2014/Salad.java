package APCS_2014;

public class Salad implements MenuItem{

	private String myName;
	private double myPrice;
	
	public Salad(String name, double price)
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

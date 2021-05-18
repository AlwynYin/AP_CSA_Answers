package APCS_2014;

public class Trio implements MenuItem{
	private Sandwich mySandwich;
	private Salad mySalad;
	private Drink myDrink;
	
	public Trio(Sandwich sandwich, Salad salad, Drink drink)
	{
		mySandwich = sandwich;
		mySalad = salad;
		myDrink = drink;
	}
	
	public String getName()
	{
		return mySandwich.getName() + "/" + mySalad.getName() + "/" + myDrink.getName() + " Trio";
	}
	
	public double getPrice()
	{
		double sandwichPrice = mySandwich.getPrice();
		double saladPrice = mySalad.getPrice();
		double drinkPrice = myDrink.getPrice();


		/*
		a more complicated method
		if (sandwichPrice <= saladPrice)
		{
			if (sandwichPrice <= drinkPrice)
				price = drinkPrice + saladPrice; //sandwichPrice
			else
				price = sandwichPrice + saladPrice; //drinkPrice
		}
		else 
		{
			if (saladPrice < drinkPrice)
				price = drinkPrice + sandwichPrice; //saladPrice
			else
				price = saladPrice + sandwichPrice; //drinkPrice
		}
		return price;
		*/
		
		if (sandwichPrice <= saladPrice && sandwichPrice <= drinkPrice)
			return saladPrice + drinkPrice;
		else if (saladPrice <= sandwichPrice && saladPrice <= drinkPrice)
			return sandwichPrice + drinkPrice;
		else
			return saladPrice + sandwichPrice;
	}
}

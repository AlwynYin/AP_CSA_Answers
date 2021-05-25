package APCS_2011;
import java.util.ArrayList;
public class FuelDepotMain {
	public static void main(String[] args)
	{
		ArrayList<FuelTank> tanks = new ArrayList<FuelTank>();
		tanks.add(new FuelTank(20));
		tanks.add(new FuelTank(30));
		tanks.add(new FuelTank(80));
		tanks.add(new FuelTank(55));
		tanks.add(new FuelTank(50));
		tanks.add(new FuelTank(75));
		tanks.add(new FuelTank(20));
		
		FuelDepot depot1 = new FuelDepot(tanks);
		
		System.out.println(depot1);
		System.out.println(depot1.nextTankToFill(50));
		depot1.moveToLocation(2);
		System.out.println(depot1.nextTankToFill(15));
	}
}

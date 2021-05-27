package APCS_2009;

public class BatteryChargerMain {
	public static void main(String[] args)
	{
		int[] rate = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
		BatteryCharger charger1 = new BatteryCharger(rate);
		
		System.out.print(charger1.getChargeStartTime(1) + " ");
		System.out.println(charger1.getChargingCost(charger1.getChargeStartTime(1), 1));
		System.out.print(charger1.getChargeStartTime(2) + " ");
		System.out.println(charger1.getChargingCost(charger1.getChargeStartTime(2), 2));
		System.out.print(charger1.getChargeStartTime(7) + " ");
		System.out.println(charger1.getChargingCost(charger1.getChargeStartTime(7), 7));
		System.out.print(charger1.getChargeStartTime(30) + " ");
		System.out.println(charger1.getChargingCost(charger1.getChargeStartTime(30), 30));
 	}
}

package APCS_2009;

public class BatteryCharger {
    private int[] rateTable;

    public BatteryCharger(int[] newRateTable) {
        rateTable = newRateTable;
    }

    public int getChargingCost(int startHour, int chargeTime) {
        int cost = 0;
        for (int i = startHour; i < startHour + chargeTime; i++) {
            int time = i % 24;
            cost += rateTable[time];
        }
        return cost;
    }

    public int getChargeStartTime(int chargeTime) {
        // initial starting time
        int bestStartTime = 0;
        int minChargingCost = getChargingCost(bestStartTime, chargeTime);
        // loop to find min time
        int chargingCost;
        for (int startTime = 1; startTime < rateTable.length; startTime++) {
            chargingCost = getChargingCost(startTime, chargeTime);
            if (chargingCost < minChargingCost) {
                minChargingCost = chargingCost;
                bestStartTime = startTime;
            }
        }
        return bestStartTime;
    }
}

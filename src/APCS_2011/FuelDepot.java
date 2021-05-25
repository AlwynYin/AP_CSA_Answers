package APCS_2011;

import java.util.ArrayList;

public class FuelDepot {
    private FuelRobot filler;
    private ArrayList<FuelTank> tanks;

    public FuelDepot(ArrayList<FuelTank> tks) {
        tanks = tks;
        filler = new FuelRobot();
    }

    public int nextTankToFill(int threshold) {
        int lowest = tanks.get(0).getFuelLevel();
        int lowestIndex = 0;
        for (int i = 1; i < tanks.size(); i++) {
            if (tanks.get(i).getFuelLevel() < lowest) {
                lowest = tanks.get(i).getFuelLevel();
                lowestIndex = i;
            }
        }
        if (lowest < threshold)
            return lowestIndex;
        else
            return filler.getCurrentIndex();
    }

    public void moveToLocation(int locIndex) {
        if (filler.getCurrentIndex() > locIndex) {
            if (filler.isFacingRight())
                filler.changeDirection();
            filler.moveForward(locIndex - filler.getCurrentIndex());
        }
        else if (filler.getCurrentIndex() < locIndex) {
            if (!filler.isFacingRight())
                filler.changeDirection();
            filler.moveForward(locIndex - filler.getCurrentIndex());
        }
    }

    public String toString() {
        String str = "";
        for (FuelTank each: tanks)
            str += each.getFuelLevel() + " ";
        return str;
    }
}

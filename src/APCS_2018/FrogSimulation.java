package APCS_2018;
// due to undefined methods, this class can't be strictly tested.
public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    // the method body is not included in the question
    private int hopDistance() {
        return 0;
    }

    public boolean simulate() {
        int totalDist = 0;
        for (int i = 0; i < maxHops; i++) {
            totalDist += hopDistance();
            if (totalDist >= goalDistance)
                return true;
            if (totalDist < 0)
                return false;
        }
        // the frog has reached maximum num of hops
        return false;
    }

    public double runSimulations(int num) {
        int success = 0;
        for (int i = 0; i < num; i++) {
            if (simulate())
                success++;
        }
        return (double) success / num;
    }
}

package APCS_2019;

public class StepTracker {
    private int totalDays;
    private int activeDays;
    private int totalSteps;
    private final int minSteps; // final variables are not required in ap test

    public StepTracker(int st) {
        minSteps = st;
        totalDays = 0;
        activeDays = 0;
        totalSteps = 0;
    }

    public int activeDays(){return activeDays;}

    public double averageSteps() {
        if (totalDays == 0)
            return 0;
        else
            return totalSteps/(double) totalDays;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps > minSteps)
            activeDays++;
    }
}

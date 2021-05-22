package APCS_2012;

public class ClimbInfo {
    private String myPeakName;
    private int myClimbTime;

    public ClimbInfo(String peakName, int climbTime) {
        myClimbTime = climbTime;
        myPeakName = peakName;
    }

    public String getName() {return myPeakName;}
    public int getClimbTime() {return myClimbTime;}

    public String toString() {
        return "(" + myPeakName + ", " + myClimbTime + ")";
    }
}

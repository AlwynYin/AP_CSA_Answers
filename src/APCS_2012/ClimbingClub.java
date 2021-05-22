package APCS_2012;

import java.util.ArrayList;

public class ClimbingClub {
    private ArrayList<ClimbInfo> climbList;

    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    public ClimbingClub(ClimbInfo[] infoList) {
        climbList = new ArrayList<ClimbInfo>();
        for (ClimbInfo info: infoList) {
            climbList.add(info);
        }
    }

    public void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    // add in alphabetical order
    public void addClimbAlpha(String peakName, int climbTime) {
        //find the position
        int position = 0;
        while (peakName.compareTo(climbList.get(position).getName()) <= 0)
            position++;
        climbList.add(position-1, new ClimbInfo(peakName, climbTime));
    }

    public String toString() {
        String str = "";
        for (ClimbInfo each: climbList) {
            str += each + ",";
        }
        return str;
    }
}

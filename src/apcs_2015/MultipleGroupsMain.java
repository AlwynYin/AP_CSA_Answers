package apcs_2015;

import java.util.ArrayList;

public class MultipleGroupsMain {
    public static void main(String[] args) {
        ArrayList<NumberGroup> ranges = new ArrayList<NumberGroup>();
        ranges.add(new Range(5, 8));
        ranges.add(new Range(10, 12));
        ranges.add(new Range(1, 6));
        NumberGroup multipleGroups = new MultipleGroups(ranges);

        System.out.println(multipleGroups.contains(2));
        System.out.println(multipleGroups.contains(9));
        System.out.println(multipleGroups.contains(6));
    }
}

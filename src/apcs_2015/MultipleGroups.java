package apcs_2015;

import java.util.ArrayList;

public class MultipleGroups implements NumberGroup{
    private ArrayList<NumberGroup> groupList;

    public MultipleGroups(ArrayList<NumberGroup> groups) {
        groupList = groups;
    }

    @Override
    public boolean contains(int n) {
        for (NumberGroup numberGroup:
             groupList) {
            if (numberGroup.contains(n))
                return true;
        }
        return false;
    }
}

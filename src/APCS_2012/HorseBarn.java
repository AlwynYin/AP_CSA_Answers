package APCS_2012;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] theSpaces) {
        spaces = theSpaces;
    }

    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            // check:
            // if it's null
            // if the name matches
            if (spaces[i] != null && spaces[i].getName().equals(name))
                return i;
        }
        return -1;
    }

    public void consolidate() {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null) {
                // find the first null object
                for (int j = i; j < spaces.length; j++) {
                    if (spaces[j] != null) {
                        //swap the two and stop
                        Horse temp = spaces[i];
                        spaces[i] = spaces[j];
                        spaces[j] = temp;
                        break;
                    }
                }
            }
        }
    }

    public String toString() {
        String str = "";
        for (Horse horse: spaces) {
            str += horse + " ";
        }
        return str;
    }
}

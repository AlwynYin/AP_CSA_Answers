package APCS_2012;

public class Horse {
    private String myName;
    private int myWeight;

    public Horse(String name, int weight) {
        myName = name;
        myWeight = weight;
    }

    public String getName() {
        return myName;
    }
    int getWeight() {
        return myWeight;
    }

    public String toString() {
        return "(" + myName + ", " + myWeight + ")";
    }
}

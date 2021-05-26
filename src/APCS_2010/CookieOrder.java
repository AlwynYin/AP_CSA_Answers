package APCS_2010;

public class CookieOrder {
    private String myVariety;
    private int myNumBoxes;

    public CookieOrder(String variety, int numBoxes) {
        myVariety = variety;
        myNumBoxes = numBoxes;
    }

    public String getVariety() {
        return myVariety;
    }

    public int getNumBoxes() {
        return myNumBoxes;
    }
}

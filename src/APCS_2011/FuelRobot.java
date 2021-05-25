package APCS_2011;

public class FuelRobot {
    private int currentIndex;
    private boolean facingRight;

    public FuelRobot() {
        currentIndex = 0;
        facingRight = true;
    }

    public boolean isFacingRight() {
        return facingRight;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void changeDirection() {
        facingRight = !facingRight;
    }

    public void moveForward(int numLocs) {
        if (facingRight) {
            currentIndex += numLocs;
        }
        else {
            currentIndex -= numLocs;
        }
    }
}

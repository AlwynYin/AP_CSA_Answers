package APCS_2008;

public class Time {
    private int myHours;
    private int myMinutes;

    public Time(int hour, int minute) {
        myHours = hour;
        myMinutes = minute;
    }

    public int getHours() {
        return myHours;
    }

    public int getMinutes() {
        return myMinutes;
    }

    public int minutesUntil(Time Other) {
        int minutes = Other.getHours() * 60 + Other.getMinutes();
        int selfMinutes = myHours * 60 + myMinutes;
        return Math.abs(minutes - myMinutes);
    }
}

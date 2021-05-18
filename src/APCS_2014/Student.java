package APCS_2014;

public class Student {
    private String myName;
    private int myAbsentCount;

    public Student(String name, int count) {
        myName = name;
        myAbsentCount = count;
    }

    public String getName() {
        return myName;
    }

    public int getAbsentCount() {
        return myAbsentCount;
    }

    public String toString() {
        return "(" + myName + ", " + myAbsentCount + ")";
    }
}

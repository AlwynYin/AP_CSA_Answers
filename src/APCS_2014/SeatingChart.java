package APCS_2014;

import java.util.ArrayList;

public class SeatingChart {
    private Student[][] seats;

    public SeatingChart(ArrayList<Student> studentList, int rows, int cols) {
        seats = new Student[rows][cols];
        for (int col = 0; col < seats[0].length; col++) {
            for (int row = 0; row < seats.length; row++) {
                if (studentList.size() != 0)
                    seats[row][col] = studentList.remove(0);
                else
                    seats[row][col] = null;
            }
        }
    }

    public int removeAbsentStudent(int allowedAbsence) {
        int count = 0;
        for (int row = 0; row < seats.length; row++)
            for (int col = 0; col < seats[0].length; col++)
                if (seats[row][col] != null && seats[row][col].getAbsentCount() > allowedAbsence) {
                    seats[row][col] = null;
                    count++;
                }
        return count;
    }

    public String toString() {
        String str = "";
        for (Student[] students: seats) {
            for (Student student: students) {
                str += student + " ";
            }
            str += "\n";
        }
        return str;
    }
}

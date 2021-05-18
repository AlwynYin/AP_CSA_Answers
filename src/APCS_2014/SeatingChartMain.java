package APCS_2014;

import java.util.ArrayList;

public class SeatingChartMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Karen", 3));
        students.add(new Student("Liz", 1));
        students.add(new Student("Paul", 4));
        students.add(new Student("Lester", 1));
        students.add(new Student("Henry", 5));
        students.add(new Student("Renee", 9));
        students.add(new Student("Glen", 2));
        students.add(new Student("Fran", 6));
        students.add(new Student("David", 1));
        students.add(new Student("Danny", 3));
        SeatingChart chart = new SeatingChart(students, 3, 4);
        System.out.println(chart);
        System.out.println(chart.removeAbsentStudent(4));
        System.out.println(chart);
    }
}

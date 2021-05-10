package APCS_2019;

// Alwyn Yin, 5/10/2021
// Due to too much undefined methods, this file cannot be tested, so they might be incorrect.

public class APCalendar {
    private static boolean isLeapYear(int year) {
        return true;
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for (int i = year1; i < year2; i++) {
            if (isLeapYear(year1)) {
                count++;
            }
        }
        return count;
    }

    private static int firstDayOfYear(int year) {
        return 0;
    }

    private static int dayOfYear(int month, int day, int year) {
        return 0;
    }

    public  static int dayOfWeek (int month, int day, int year) {
        int firstDay = firstDayOfYear(year);
        int theDay = dayOfYear(month, day, year);
        return (theDay+firstDay)%7;
    }
}

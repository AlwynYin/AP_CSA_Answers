package APCS_2008;

import java.util.ArrayList;

public class Trip {
    private ArrayList<Flight> flights;

    public int getDuration() {
        if (flights.size() == 0)
            return 0;

        Time startTime = flights.get(0).getDepartureTime();
        Time endTime = flights.get(flights.size() - 1).getArrivalTime();
        return startTime.minutesUntil(endTime);
    }

    public int getShortestLayover() {
        int shortest = getDuration();
        Time a;
        Time b;
        int layover;
        for (int i = 0; i < flights.size() - 1; i++) {
            a = flights.get(i).getArrivalTime();
            b = flights.get(i+1).getDepartureTime();
            layover = a.minutesUntil(b);
            if (layover < shortest)
                shortest = layover;
        }
        return shortest;
    }
}

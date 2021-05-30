package APCS_2008;

public class Flight {
    private Time myDepartureTime;
    private Time myArrivalTime;

    public Flight(Time departure, Time arrival) {
        myDepartureTime = departure;
        myArrivalTime = arrival;
    }

    public Time getArrivalTime() {
        return myArrivalTime;
    }

    public Time getDepartureTime() {
        return myDepartureTime;
    }
}

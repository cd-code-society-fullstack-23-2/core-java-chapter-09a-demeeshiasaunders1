package com.codedifferently.partB;

public class Plane {
    private static int idCount = 1;
    private Integer id;
    public String destination;
    private String departureTime;
    private Ticket[] seats;

    public Plane(String destination, String departureTime, Integer seatNumber){
        this.destination = destination;
        this.departureTime = departureTime;
        this.seats = new Ticket[seatNumber]; //this is more flexible
        this.id = idCount++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Ticket[] getSeats() {
        return seats;
    }

    public void setSeats(Ticket[] seats) {
        this.seats = seats;
    }

    public String toString(){
        return String.format("%d %s %s %d", id, destination, departureTime, seats.length);
    }
}

package com.moin.recyclerview_191118.Model;

public class Flight {
    String From, To;

    public Flight() {
    }

    public Flight(String from, String to) {
        From = from;
        To = to;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }
}

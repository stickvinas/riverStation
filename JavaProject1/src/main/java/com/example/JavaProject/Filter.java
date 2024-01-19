package com.example.JavaProject;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Filter {
    String placesFilter;
    String shipsFilter;
    int durationFilter;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date departureFilter;

    public Filter() {
    }

    public Date getDepartureFilter() {
        return departureFilter;
    }

    public void setDepartureFilter(Date departureFilter) {
        this.departureFilter = departureFilter;
    }

    public String getPlacesFilter() {
        return placesFilter;
    }

    public void setPlacesFilter(String placesFilter) {
        this.placesFilter = placesFilter;
    }

    public String getShipsFilter() {
        return shipsFilter;
    }

    public void setShipsFilter(String shipsFilter) {
        this.shipsFilter = shipsFilter;
    }

    public int getDurationFilter() {
        return durationFilter;
    }

    public void setDurationFilter(int durationFilter) {
        this.durationFilter = durationFilter;
    }
}

package com.example.JavaProject.repositories.models;

import org.springframework.format.annotation.DateTimeFormat;

public class Date {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }
}

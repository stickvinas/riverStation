package com.example.JavaProject.repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;



import java.sql.Time;
import java.util.Date;

@Table(name = "PLACES")
@ToString
@Entity
public class cruisePlaces {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "CRUISEDESTINATIONSID", nullable = false)
    private Integer CRUISEDESTINATIONSID;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "ARRIVALTIME", nullable = false)
    private Time ARRIVALTIME;

    @Column(name = "DEPARTURETIME", nullable = false)
    private Time DEPARTURETIME;
    @Column(name = "DURATION", nullable = false)
    private Integer DURATION;

    public int getCRUISEDESTINATIONSID() {
        return CRUISEDESTINATIONSID;
    }

    public void setCRUISEDESTINATIONSID(int CRUISEDESTINATIONSID) {
        this.CRUISEDESTINATIONSID = CRUISEDESTINATIONSID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Date getARRIVALTIME() {
        return ARRIVALTIME;
    }

    public void setARRIVALTIME(Date ARRIVALTIME) {
        this.ARRIVALTIME = (Time) ARRIVALTIME;
    }

    public Date getDEPARTURETIME() {
        return DEPARTURETIME;
    }

    public void setDEPARTURETIME(Date DEPARTURETIME) {
        this.DEPARTURETIME = (Time) DEPARTURETIME;
    }
    public int getDURATION() {return DURATION;}

    public void setDURATION(int DURATION) {this.DURATION = DURATION;}
}

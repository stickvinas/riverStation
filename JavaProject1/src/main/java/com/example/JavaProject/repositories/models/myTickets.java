package com.example.JavaProject.repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;



import java.util.Date;

@ToString
@Entity
@Table(name = "TICKETS")
public class myTickets {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "CRUISESHIPID", nullable = false)
    private Integer CRUISESHIPID;

    @Column(name = "TICKETPRICE", nullable = false)
    private Integer TICKETPRICE;

    @Column(name = "TICKETDEPARTURETIME", nullable = false)
    private Date TICKETDEPARTURETIME;

    @Column(name = "TICKETARRIVALTIME", nullable = false)
    private Date TICKETARRIVALTIME;

    @Column(name = "TICKETCABIN", nullable = false)
    private String TICKETCABIN;

    @Column(name = "USERID", nullable = false)
    private Integer USERID;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCRUISESHIPID() {
        return CRUISESHIPID;
    }

    public void setCRUISESHIPID(int CRUISESHIPID) {
        this.CRUISESHIPID = CRUISESHIPID;
    }

    public int getTICKETPRICE() {
        return TICKETPRICE;
    }

    public void setTICKETPRICE(int TICKETPRICE) {
        this.TICKETPRICE = TICKETPRICE;
    }

    public Date getTICKETDEPARTURETIME() {
        return TICKETDEPARTURETIME;
    }

    public void setTICKETDEPARTURETIME(Date TICKETDEPARTURETIME) {
        this.TICKETDEPARTURETIME = TICKETDEPARTURETIME;
    }

    public Date getTICKETARRIVALTIME() {
        return TICKETARRIVALTIME;
    }

    public void setTICKETARRIVALTIME(Date TICKETARRIVALTIME) {
        this.TICKETARRIVALTIME = TICKETARRIVALTIME;
    }

    public String getTICKETCABIN() {
        return TICKETCABIN;
    }

    public void setTICKETCABIN(String TICKETCABIN) {
        this.TICKETCABIN = TICKETCABIN;
    }

    public Integer getUSERID() {
        return USERID;
    }

    public void setUSERID(Integer USERID) {
        this.USERID = USERID;
    }
}

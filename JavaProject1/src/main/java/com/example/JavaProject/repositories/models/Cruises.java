package com.example.JavaProject.repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;



import java.util.Date;

@ToString
@Entity
@Table(name = "Cruises")
public class Cruises {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "CRUISESHIPID", nullable = false)
    private Integer CRUISESHIPID;

    @Column(name = "CRUISESHIPNAME", nullable = false)
    private String CRUISESHIPNAME;

    @Column(name = "CRUISESHIPDESTINATION", nullable = false)
    private String CRUISESHIPDESTINATION;

    @Column(name = "CRUISESHIPDEPARTURE", nullable = false)
    private Date CRUISESHIPDEPARTURE;

    @Column(name = "CRUISESDURATION", nullable = false)
    private Integer CRUISESDURATION;

    public int getCRUISESDURATION() {
        return CRUISESDURATION;
    }

    public void setCRUISESDURATION(int CRUISESDURATION) {
        this.CRUISESDURATION = CRUISESDURATION;
    }

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

    public String getCRUISESHIPNAME() {
        return CRUISESHIPNAME;
    }

    public void setCRUISESHIPNAME(String CRUISESHIPNAME) {
        this.CRUISESHIPNAME = CRUISESHIPNAME;
    }

    public String getCRUISESHIPDESTINATION() {
        return CRUISESHIPDESTINATION;
    }

    public void setCRUISESHIPDESTINATION(String CRUISESHIPDESTINATION) {
        this.CRUISESHIPDESTINATION = CRUISESHIPDESTINATION;
    }

    public Date getCRUISESHIPDEPARTURE() {
        return CRUISESHIPDEPARTURE;
    }

    public void setCRUISESHIPDEPARTURE(Date CRUISESHIPDEPARTURE) {
        this.CRUISESHIPDEPARTURE = CRUISESHIPDEPARTURE;
    }
}

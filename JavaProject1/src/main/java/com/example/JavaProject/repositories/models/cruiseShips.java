package com.example.JavaProject.repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;



@ToString
    @Entity
    @Table(name = "CRUISE_SHIPS")
    public class cruiseShips {
        @Id
        @Column(name = "ID", nullable = false)
        private Integer ID;

        @Column(name = "NAME", nullable = false)
        private String NAME;

        @Column(name = "NUMBEROFPLACES", nullable = false)
        private Integer NUMBEROFPLACES;

        @Column(name = "NUMBEROFWORKERS", nullable = false)
        private Integer NUMBEROFWORKERS;

        @Column(name = "FUELCAPACITY", nullable = false)
        private Integer FUELCAPACITY;

        @Column(name = "STORAGECAPACITY", nullable = false)
        private Integer STORAGECAPACITY;

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

    public int getNUMBEROFPLACES() {
        return NUMBEROFPLACES;
    }

    public void setNUMBEROFPLACES(int NUMBEROFPLACES) {
        this.NUMBEROFPLACES = NUMBEROFPLACES;
    }

    public int getNUMBEROFWORKERS() {
        return NUMBEROFWORKERS;
    }

    public void setNUMBEROFWORKERS(int NUMBEROFWORKERS) {
        this.NUMBEROFWORKERS = NUMBEROFWORKERS;
    }

    public int getFUELCAPACITY() {
        return FUELCAPACITY;
    }

    public void setFUELCAPACITY(int FUELCAPACITY) {
        this.FUELCAPACITY = FUELCAPACITY;
    }

    public int getSTORAGECAPACITY() {
        return STORAGECAPACITY;
    }

    public void setSTORAGECAPACITY(int STORAGECAPACITY) {
        this.STORAGECAPACITY = STORAGECAPACITY;
    }


}

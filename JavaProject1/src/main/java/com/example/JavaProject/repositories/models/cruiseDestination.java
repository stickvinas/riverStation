package com.example.JavaProject.repositories.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;


        @ToString
        @Entity
        public class cruiseDestination {
            @Id
            @Column(name = "ID", nullable = false)
            private Integer ID;

            @Column(name = "NAME", nullable = false)
            private String NAME;

            @Column(name = "SHIPID", nullable = false)
            private Integer SHIPID;

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

    public int getSHIPID() {
        return SHIPID;
    }

    public void setSHIPID(int SHIPID) {
        this.SHIPID = SHIPID;
    }
}

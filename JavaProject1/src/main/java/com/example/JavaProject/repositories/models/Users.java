package com.example.JavaProject.repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;



@ToString
@Entity
@Table(name = "USERS")
public class Users {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "SURNAME", nullable = false)
    private String SURNAME;

    @Column(name = "PATRONYMIC", nullable = false)
    private String PATRONYMIC;


    @Column(name = "TICKETID", nullable = false)
    private Integer TICKETID;


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

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getPATRONYMIC() {
        return PATRONYMIC;
    }

    public void setPATRONYMIC(String PATRONYMIC) {
        this.PATRONYMIC = PATRONYMIC;
    }

    public int getTICKETID() {
        return TICKETID;
    }

    public void setTICKETID(int TICKETID) {
        this.TICKETID = TICKETID;
    }
}

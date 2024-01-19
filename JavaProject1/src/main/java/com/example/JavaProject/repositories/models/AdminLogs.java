package com.example.JavaProject.repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;



@ToString
@Entity
@Table(name = "ADMINLOGS")
public class AdminLogs {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "USERNAME", nullable = false)
    private String USERNAME;

    @Column(name = "PASSWORD", nullable = false)
    private String PASSWORD;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
}

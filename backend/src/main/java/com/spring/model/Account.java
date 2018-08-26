package com.spring.model;


import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "accounts")
public class Account {
    private Integer AccNo;
    private String firstName;
    private String lastName;

    public Account(Integer Accno, String firstName, String lastName){
        this.AccNo=Accno;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Integer getAccNo() {
        return AccNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccNo(Integer accNo) {
        AccNo = accNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

package com.spring.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    private Integer accNo;
    private String firstName;
    private String lastName;

    public Account(Integer AccNo, String firstName, String lastName){
        this.accNo=AccNo;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Integer getAccNo() {
        return accNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccNo(Integer AccNo) {
        this.accNo = AccNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

package com.spring.model;


import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer AccNo;

    private String firstName;
    private String lastName;

    public Account(Integer AccNo, String firstName, String lastName){
        this.AccNo=AccNo;
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

    public void setAccNo(Integer AccNo) {
        this.AccNo = AccNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

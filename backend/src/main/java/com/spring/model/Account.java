package com.spring.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="accounts")
public class Account implements Serializable {
    public Account(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="AccNo")
    private Integer AccNo;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
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

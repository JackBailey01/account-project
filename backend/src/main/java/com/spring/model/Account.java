package com.spring.model;


import javax.persistence.*;


@Entity
@Table(name="accounts")
public class Account{
    public Account(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="accNo")
    private Integer accNo;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    public Account(Integer accNo, String firstName, String lastName){
        this.accNo=accNo;
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
        this.accNo = accNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

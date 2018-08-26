package com.spring.model;

public class Account {
    Integer AccNo;
    String firstName;
    String lastName;

    public Account(Integer AccNo, String firstName,String lastName){
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

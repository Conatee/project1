package com.example.project1;

public class ContactData {
    private String name, number;

    public ContactData(){
    }

    public ContactData(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }
//
    public void setNumber(String number) {
        this.number = number;
    }
}
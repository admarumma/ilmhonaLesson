package com.company;

public class Abonent {
    private int number;
    private String name;
    private String lastName;
    private String patronymic;
    private String address;
    private int callTime;

    public Abonent(int number, String name, String lastName,String patronymic,String address, int callTime){
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.callTime = callTime;
    }

    //Setter
    public void setNumber(int number){
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCallTime(int callTime){
        this.callTime = callTime;
    }

    //Getters
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getAddress(){
        return address;
    }
    public int getCallTime(){
        return callTime;
    }

    //GetAll

    public String getAll(){
        return "Name : " + name+ "\n" + "Lastname : " + lastName + "\n"+ "Patronymic : " + patronymic+ "\n" + "Address : " + address+ "\n" + "Country calls : " + callTime;
    }
}

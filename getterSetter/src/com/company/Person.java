package com.company;

public class Person {
    private String name;
    private String lastName;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int INN;

    public Person(String name, String lastName,String patronymic,String address, int cardNumber,int INN){
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.INN = INN;
    }

    //Setter

    public void setName(String name){ // Я правильно понял каждый по отдельноти "Создать методы: установка значений атрибутов ("сеттер")"
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
    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
    public void setINN(int INN){
        this.INN = INN;
    }

    //Getters

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
    public int getCardNumber(){
        return cardNumber;
    }
    public int getINN(){
        return INN;
    }

    //GetAll

    public String getAll(){
        return name+ "\n" + lastName+ "\n" + patronymic+ "\n" + address+ "\n" + cardNumber+ "\n" + INN;
    }
}

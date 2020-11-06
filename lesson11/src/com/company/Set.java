package com.company;

public class Set {
    public int numberOne;
    public int numberTwo;

    public Set(int num1, int num2){
        numberOne = num1;
        numberTwo = num2;
        getDef();
        getSum();
        getBig();
    }
    public void getDef(){
        System.out.println(this.numberOne + " " + this.numberTwo);
    }
    public void getSum(){
        System.out.println(this.numberOne + this.numberTwo);
    }
    public void getBig(){
        if(this.numberOne > this.numberTwo){
            System.out.println("The biggest number is " + this.numberOne);
        }else{
            System.out.println("The biggest number is " + this.numberTwo);
        }
    }
}
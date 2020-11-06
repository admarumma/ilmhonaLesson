package com.company;

public class Counter {
    public double currentNumber = 0;

    public Counter(double currentNumber) {
        this.currentNumber = currentNumber;
        plusOne();
        minusOne();
        show(); // как вы думаете это хороший метод вызвать методы в конструкторе
    }

    public void plusOne(){
        currentNumber++;
    }
    public void minusOne(){
        if(currentNumber > 0){
            currentNumber--;
        }
    }
    public void show(){
        System.out.println(currentNumber);
    }
}

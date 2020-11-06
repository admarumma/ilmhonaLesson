package com.company;

public class Main {

    public static void main(String[] args) {
        Set set = new Set(23,43);
        Second second = new Second(2,3);
        Counter counter = new Counter(4.3);
    }
}

class Second {
    public int numberOne;
    public int numberTwo;

    public Second(int num1, int num2){
        this.numberOne = num1;
        this.numberTwo = num2;
    }
}

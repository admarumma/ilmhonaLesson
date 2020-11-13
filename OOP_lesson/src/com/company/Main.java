package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box box1 = new Box();
        box1.height   = 40;
        box1.width    = 40;
        box1.material = "Пластик";
        box1.weight   = 100;

        Box box2 = new Box();
        box2.height   = 20;
        box2.width    = 20;
        box2.material = "Дерево";
        box2.weight   = 30;

        Apple apple1  = new Apple();
        apple1.sort   = "Вильямс Прайд";
        apple1.color  = "Красное";
        apple1.type   = "Нет";

        Apple apple2  = new Apple();
        apple2.sort   = "Антоновка";
        apple2.color  = "Зелёная";
        apple2.type   = "Да";

        Car mercedes = new Car();
        mercedes.name     =  "mercedes";
        mercedes.from     =  1963;
        mercedes.color     =  "black";
        mercedes.type     =  "s";

        Car rangeRover = new Car();
        rangeRover.name     =  "range rover";
        rangeRover.from     =  1970;
        rangeRover.color     =  "whiteBlack";
        rangeRover.type     =  "Combi";

        System.out.println("BOX \n Высота : " + box1.height + "\n Ширина : " + box1.width + "\nМатериал : " + box1.material + "\n Вес : " + box1.weight);
        System.out.println("BOX2 \n Высота : " + box2.height + "\n Ширина : " + box2.width + "\nМатериал : " + box2.material + "\n Вес : " + box2.weight);
        System.out.println("Apple2 \n Сорт : " + apple2.sort + "\n Цвет : " + apple2.color + "\n Кислое : " + apple2.type);
        System.out.println("Mercedes \n Name : " + mercedes.name + "\n Color : " + mercedes.color + "\nFounded : " + mercedes.from + "\n Type : " + mercedes.type);
        System.out.println("Range Rover \n Name : " + rangeRover.name + "\n Color : " + rangeRover.color + "\nFounded : " + rangeRover.from + "\n Type : " + rangeRover.type);
    }
}
class Box {
    double height;
    double width;
    String material;
    double weight;
}
class Apple{
    String sort;
    String color;
    String type;
}
class Car{
    String name;
    int from;
    String color;
    String type;
}
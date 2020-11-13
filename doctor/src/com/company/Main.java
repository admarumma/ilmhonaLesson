package com.company;

public class Main {

    public static void main(String[] args) {

    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getCharacters(){
        String eye = "\tEyes";
        String ears = "\tEars";
        String stomach = "\tstomach";

        return eye + "\n" +ears + "\n" + stomach;
    }

    public String[] getEye(){
        String color = "BLUE";
        String size = "Big";
        String[] ar = new String[2];
        ar[Integer.parseInt("color")] = color;
        ar[Integer.parseInt("size")] = size;

        return ar;
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[5];

        Person umar   = new Person("Umar","Adilov", "Икромович", "Чайкина", 123456789, 3);
        Person sunnat   = new Person("Суннатулло","Раджабов", "Шахзодович", "Чайковский", 1224346789, 2);
        Person rasul   = new Person("Расул","Умаров", "Сафарович", "Сомони", 1234354789, 5);
        Person nizom   = new Person("Низом","Курбонов", "Сафаралиевич", "Сомони", 1233456789, 4);
        Person mavluda   = new Person("Мавлуда","Курбонова", "Номалумовна", "Фирдавси", 1234556789, 8);

        people[0] = umar;
        people[1] = sunnat;
        people[2] = rasul;
        people[3] = nizom;
        people[4] = mavluda;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getINN() % 2 == 0){
                System.out.println(people[i].getAll());
            }
        }

        Abonent[] abonents = new Abonent[5];

        Abonent adilov   = new Abonent(919919919, "Umar","Adilov", "Икромович", "Чайкина", 123456789);
        Abonent radjabov   = new Abonent(433944422,"Суннатулло","Раджабов", "Шахзодович", "Чайковский", 1224346789);
        Abonent umarov   = new Abonent(833442833,"Расул","Умаров", "Сафарович", "Сомони", 1234354789);
        Abonent qurbonov   = new Abonent(23442344,"Низом","Курбонов", "Сафаралиевич", "Сомони", 1233456789);
        Abonent qurbonova   = new Abonent(42342344,"Мавлуда","Курбонова", "Номалумовна", "Фирдавси", 1234556789);

        abonents[0] = adilov;
        abonents[1] = radjabov;
        abonents[2] = umarov;
        abonents[3] = qurbonov;
        abonents[4] = qurbonova;
        for (int i = 0; i < abonents.length; i++) {
            if(abonents[i].getCallTime() > 3424){
                System.out.println(abonents[i].getAll());
            }
        }
    }
}

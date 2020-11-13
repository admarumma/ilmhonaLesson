package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello to the wonderfull game. Please your name :");

        String name = scanner.next();

        System.out.println("Hello " + name);

        System.out.println("Do you want to start the game");

        if (askPer(name)){
            play(name);
        }else{
            System.out.println("Good buy :)");
        }
    }

    public static boolean askPer(String name) {
        boolean ready = false;
        while(!ready){
            Scanner scanner = new Scanner(System.in);
            String opinion = scanner.next();
            switch (opinion) {
                case ("yes"):
                    System.out.println("Ok lets start the game " + name);
                    ready = true;
                    return true;
                case ("no"):
                    System.out.println("ok we will wait for yes " + name);
                    break;
                default:
                    System.out.println("You can answer only YES or NO " + name);
                    break;
            }
        }
        return false;
    }

    public static void play(String name) {
        Random randomNum = new Random();
        boolean won = false;
        int tried = 0;
        int x = randomNum.nextInt(21);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game have started. You can guess a number");

        int userInp = scanner.nextInt();

        while(!won){
            if(tried < 5){
                if(x == userInp){
                    won = true;
                }else if(userInp > x){
                    System.out.println("Guess lower");
                    userInp = scanner.nextInt();
                }else if(userInp < x){
                    System.out.println("Guess upper");
                    userInp = scanner.nextInt();
                }
            }else{
                break;
            }
            tried++;
        }
        if(won){
            boolean yes = false;
            System.out.println("Congratulations you have won");
            System.out.println("Do you want to game more");
            String okNO = scanner.next();
            while(!yes) {
                switch (okNO) {
                    case ("yes"):
                        yes = true;
                        play(name);
                        break;
                    case ("no"):
                        System.out.println("Good buy :)");
                        yes = true;
                        break;
                    default:
                        System.out.println("You can answer only YES or NO " + name);
                        okNO = scanner.next();
                        break;
                }
            }
        }else{
            System.out.println("Game over :(");
            System.out.println("Do you want to reload");
            if (askPer(name)){
                play(name);
            }else{
                System.out.println("Good buy :)");
            }
        }
    }

}

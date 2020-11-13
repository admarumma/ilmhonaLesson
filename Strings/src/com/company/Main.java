package com.company;

public class Main {

    public static void main(String[] args) {
	    //First task
        String firstString = "Lorem ipsum";
        int firstStrLength = firstString.length();

        if(firstString.length() > 5){
            String firstThree = firstString.substring(0, 3);
            String lastThree = firstString.substring(firstStrLength - 3, firstStrLength);
            System.out.println("First three" + firstThree +
                    "\nLast three " + lastThree);
        }else{
            for (int i = 0; i < firstStrLength; i++) {
                System.out.println(firstString.charAt(0));
            }
        }

        //Second task
        String secondString = "Lormmmemipsum";
        char lastString = secondString.charAt(secondString.length() - 1);
        System.out.println("In string \"" + secondString + "\"  in indexses below letter " + lastString);
        for (int i = 0; i < secondString.length(); i++) {
            if(secondString.charAt(i) == lastString){
                System.out.print(i + ", ");
            }
        }


        //Third task
        String thirdString = "stuvwxyz";
        if(thirdString.indexOf('x') > -1){
            System.out.println("The string before x is " + thirdString.charAt(thirdString.indexOf('x') - 1));
        }else{
            System.out.println("There is no any x char in string \"" + thirdString + "\"");
        }
        if(thirdString.indexOf('w') > -1){
            System.out.println("The string before w is " + thirdString.charAt(thirdString.indexOf('w') - 1));
        }else{
            System.out.println("There is no any w char in string \"" + thirdString + "\"");
        }

        //Fourth task
        String fourthString = "Helmhona";
        int limit = 12 - fourthString.length();
        if(fourthString.length() > 10){
            fourthString = fourthString.substring(0, 5);
        }else{
            for (int i = 0; i < limit; i++) {
                fourthString += 'o';
            }
        }
        System.out.println(fourthString);

        //Fiveth task
        String fivethString = "here is word for changing to letter";
        String strToSearch  = "word";

        fivethString = fivethString.replace(strToSearch,"letter");
        System.out.println(fivethString);

        //Sixth task
        String sixthFirstStr  = "xhello";
        String sixthSecondStr = "stringx";
        if(sixthFirstStr.length() > sixthSecondStr.length()){
            System.out.println(count(sixthSecondStr, sixthFirstStr));
        }else{
            System.out.println(count(sixthFirstStr, sixthSecondStr));
        }

    }

    // Returning identity and same char in both strings
    public static char count(String x, String y){
        char once = ' ';
        for (int i = 0; i < x.length(); i++) {
            for (int j = 1; j < y.length(); j++) {
                if(x.charAt(i) == y.charAt(j)){
                    if(checkIdentity(x.charAt(i), x) && checkIdentity(x.charAt(i), y)){
                        once = x.charAt(i);
                    }
                }
            }
        }
        return once;
    }

    // Checking for identity
    public static boolean checkIdentity(char x, String str){
        boolean notSame = true;
        boolean once = true;
        for (int i = 0; i < str.length(); i++) {
            if(x == str.charAt(i)){
                if(once){
                    once = false;
                }else{
                    notSame = false;
                }
            }
        }
        return notSame;
    }
}

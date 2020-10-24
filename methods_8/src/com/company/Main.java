package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,-6,5,2,4,-2,2,4,1,-5,6};
        System.out.println("Getting max number " + max(2, 4));
        System.out.println("Getting Sum of squares of nums " + sumOfSquares(2, 10));
        System.out.println("Getting max number in array " + maxInArray(a));
        System.out.println("Sum of all numbers in array   " + sumOfArray(a));
        int[] b = delNeg(a);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + ",");
        }

    }

    public static int max(int a, int b){          //Getting max num
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static int sumOfSquares(int a, int b){  // Sum of squares of nums
        int sum = 0;
        while(a <= b){
            sum += Math.pow(a, 2);
            a++;
        }
        return sum;
    }
    public static int maxInArray(int[] a){       // Getting max num in array
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static int[] delNeg(int[] a){            //Deleting negative numbers
        int neg = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                neg++;
            }
        }
        int[] arr = new int[neg];
        int j = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                arr[j] = a[i];
                j++;
            }
        }
        return arr;
    }
    public static int sumOfArray(int[] a){      // Sum of array nums
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}

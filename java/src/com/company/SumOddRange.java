package com.company;

public class SumOddRange {


    public static boolean isOdd(int number){

        if(number <= 0){
            return false;
        }

        if(number%2 != 0)
            return true;
        else
            return false;
    }

    public static void printOdds(int start, int end){

        for(int i = start; i <= end; i++ ){

            if(isOdd(i)){
                System.out.println(i + "is found to be an odd number");

            }else{
                System.out.println(i + " is found to be NOT an odd number");
            }
        }

    }

    public static int sumOdd(int start, int end){
        int oddSum = 0;
        int count = 0;
        if(start == 0 || end == 0 ||  end < start){
            return -1;
        }

        for(int i = start; i <= end; i++ ){

            if(isOdd(i)){
                oddSum += i;
                count +=1;

            }

            if(count == 5)
                break;
        }

        return oddSum;

    }
}

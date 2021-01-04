package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        if(number < 1)
            return false;

        //2, 3, 1, divides the number in whole, so, we're checking for all the numbers that divide the argument in whole and making a sum of them
        //if that sum is equal to the passed argument, that argument is a perfect number, and it is not otherwise
        int divisor=1;
        int sum = 0;
        while(divisor < number){
            if(number%divisor == 0){
                sum += divisor;
                }
            divisor++;
        }

        if(sum == number)
            return true;
        else
            return false;

    }



}

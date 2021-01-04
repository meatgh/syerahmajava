package com.company;

public class DigitSum {

    public static int sumOfAllDigits(int number){
        if(number < 10)
            return -1;
        int sum=0;
        int leastSignificant = 0;
        int modifiedNumber = number;
        while(modifiedNumber > 0 ){
            leastSignificant = modifiedNumber%10;
            sum += leastSignificant;
            modifiedNumber = modifiedNumber/10;

        }

        return sum;
    }
}

package com.company;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;

        int firstDigit = number%10;
        int lastDigit = 0;
        int modifiedNumber = number;
        while(modifiedNumber >= 1){
            lastDigit = modifiedNumber%10;
            modifiedNumber = modifiedNumber/10;

        }

        return firstDigit + lastDigit;
    }

}

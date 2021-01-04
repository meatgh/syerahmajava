package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 <10 || number1 > 99 || number2 <10 || number2 > 99)
            return false;

        int number1Digit1 = number1%10;
        number1 = number1/10;
        int number1Digit2 = number1/10;
        if(number1Digit1 == number2%10 ||  number1Digit1 == number2/10 || number1Digit2 == number2%10 || number1Digit2 == number2/10){
            return true;
        }
        else
            return false;
    }
}

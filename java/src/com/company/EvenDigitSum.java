package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if(number < 0)
            return -1;
        int sum = 0;
        int count = 0;
        int processedNumber = number;
        int numberOfDigits = 0;
        int digitToAdd = 0;
        while(processedNumber > 0){
            processedNumber = processedNumber / 10;
            numberOfDigits++;
        }
        boolean isEven =numberOfDigits%2==0;
        processedNumber = number;
        while(processedNumber > 0){

            digitToAdd = processedNumber %10;
            processedNumber = processedNumber/10;
            count++;
            if(isEven){
                if(count%2!=0)
                    sum +=digitToAdd;

            }else{
                if(count%2 != 0)
                    sum +=digitToAdd;

            }


        }

        return sum;
    }
}

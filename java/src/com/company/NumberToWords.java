package com.company;


//the program is to print if numbers in their word format
public class NumberToWords {

    //we're getting the number of digits present in a given number - this will be used when we come across the number that when reversed, will loose their digit count when the leading zeros are discarded
    public static int getDigitCount(int number){

        //returning 1 - meaning the digit count is only one as the logic of discarding the number and then increasing the count will not work if the number passed is zero
        if(number == 0)
            return 1;
        if(number < 0)
            return -1;

        int digitCount=0;
        while(number>0){
            number = number/10;
            digitCount++;
        }
        return digitCount;
    }

    //we're also considering the negative numbers, if the number is negative, we're make it positive, reverse it, and then add the negative sign again before returning - this is not really needed as this can be handled in the main calling method by printing the 'Invalid' and ending the functoion
    public static int reverse(int number){

        boolean isNegative = false;
        if(number < 0){
            number = -1 * number;
            isNegative = true;
        }

        int reversedNumber = 0;
        while(number > 0){
            reversedNumber = reversedNumber*10 + number%10;
            number = number/10;
        }
        if(isNegative)
            reversedNumber = reversedNumber * -1;
        return reversedNumber;
    }

    public static void numberToWords(int number){

        if(number < 0)
            System.out.println("Invalid Value");

        int reversedNumber = reverse(number);
        if(reversedNumber == 0){
            System.out.println("Zero ");
        }else{
            //because discarding will work only till the number becomes zero - we're printing the single digit passed zero number separately in the 'IF' and if the number is other, we're doing it through the switch statement
            while(reversedNumber > 0){
                int digitToPrint = reversedNumber % 10;
                reversedNumber = reversedNumber/10;

                switch (digitToPrint){

                    case 0:
                        System.out.print("Zero ");
                        continue;
                    case 1:
                        System.out.print("One ");
                        continue;
                    case 2:
                        System.out.print("Two ");
                        continue;
                    case 3:
                        System.out.print("Three ");
                        continue;
                    case 4:
                        System.out.print("Four ");
                        continue;
                    case 5:
                        System.out.print("Five ");
                        continue;
                    case 6:
                        System.out.print("Six ");
                        continue;
                    case 7:
                        System.out.print("Seven ");
                        continue;
                    case 8:
                        System.out.print("Eight ");
                        continue;
                    case 9:
                        System.out.print("Nine ");
                        continue;
                }
            }
        }

        //this is to make sure leading zeros that were discarded during reversing of number, are also printed separately by checking the different in number of digits between actual number and the reversed number
        reversedNumber = reverse(number);
        int digitDifference = getDigitCount(number) - getDigitCount(reversedNumber) ;

        if( digitDifference > 0){
            for(int i = 0; i < digitDifference; i++){
                System.out.print("Zero ");
            }
        }
    }


}

package com.company;

public class Palindrome {

    public static boolean isPalindrome(int number){

        if(number < 0)
            number = number * -1;
        boolean isPalindrome = true;
        int digit = 0;
        int reversedNumber = 0;
        int modifiedNumber = number;
        while(modifiedNumber > 0){

            digit = modifiedNumber%10;
            reversedNumber = reversedNumber*10 + digit;
            modifiedNumber = modifiedNumber/10;
        }
        if(reversedNumber == number)
            isPalindrome = true;
        else
        isPalindrome = false;
        return isPalindrome;
    }
}

package com.company;

public class PrintFactors {

    public static void printFactors(int number){

        if(number < 1)
            System.out.println("Invalid Value");
        int factors = 1;
        while(factors <= number){
            if(number % factors == 0){
                System.out.print(factors+" ");
                }
            factors++;
        }
    }
}

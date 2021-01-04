package com.company;

public class PrimeCheck {

    public static void primeCheck(int start, int end){

        int count=0;

        for(int i = start; i<= end; i++){

            if(isPrime(i)){
                System.out.println("Prime number found: " + i);
                count++;
                if(count==3){
                    System.out.println("Exiting as the count of Prime numbers is three now");
                    break;
                }

            }

        }
    }

    public static boolean isPrime(int n){

        if(n ==1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++ ){

            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}

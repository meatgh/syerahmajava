package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {
//        if (number <= 1) {
//            return -1;
//        }
//        int factor = number;
//        while(factor > 1) {
//            if (number % factor == 0) {
//                boolean isPrime = true;
//                for (int i = 2; i <= (long) Math.sqrt(factor); i++) {
//                    if (factor % i == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if (isPrime) {
//                    return factor;
//                }
//            }
//            factor--;
//        }
//        return factor;

        if(number <= 1)
            return -1;

        int factor = number;
        while (factor > 1){
            if(number% factor == 0){
                boolean isPrime = true;
                for(int i = 2; i <= (long)Math.sqrt(factor); i++){

                    if(factor % i == 0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime)
                    return factor;
            }

            factor--;
        }

        return factor;
    }
//    public static int getLargestPrime(int number){
//
//        if(number < 0 || number == 1 || number == 0 )
//            return -1;
//
//        int largestPrime = 0;
//        boolean exists = false;
//        boolean isPrime = true  ;
//
//
//
//        for(int i = 2; i <= (long) Math.sqrt(number); i++ ){
//
//            if(number % i == 0){
//                isPrime = false;
//                break;
//            }
//            else{
//                isPrime = true;
//            }
//
//        }
//
//        if(isPrime){
//
//            largestPrime= number;
//            exists = true;
//        }else{
//            isPrime = false;
//            for(int i = number-1; i > 0; i--){
//                if(exists)
//                    break;
//                if(number%i == 0 ){
//                    for(int j = 2; j <= (long) Math.sqrt(i); j++ ){
//                        if(i % j == 0){
//                            isPrime = false;
//                            break;
//                        }
//
//                        isPrime = true;
//                    }
//
//                    if(isPrime){
//                        largestPrime = i;
//                        exists = true;
//                        break;
//                    }
//                }
//            }
//        }
//
//
//
//
//        if(exists)
//            return largestPrime;
//        else
//            return -1;
//    }
}

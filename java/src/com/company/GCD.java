package com.company;

public class GCD {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int leastOfTwo = first < second ? first : second;
        int gcd = Integer.MIN_VALUE;
        while (leastOfTwo > 0){
            if(first%leastOfTwo == 0 && second % leastOfTwo == 0){
                gcd = leastOfTwo;
                break;
            }

            leastOfTwo--;
        }

//        if (first == 0)
//            return second;
//        if (second == 0)
//            return first;
//        // base case
//        if (first == second)
//            return first;
//
//        // a is greater
//        if (first > second)
//            return getGreatestCommonDivisor(first-second, second);
//        return getGreatestCommonDivisor(first, second-first);

        return gcd;
    }
}

package com.company;

public class RangeEvenNumber {

    public static boolean isEVen(int number){

        if(number % 2 == 0)
            return true;
        else
            return false;
    }

    public static int evenInRange(int start, int end){

        int count = 0;
        while(start <= end){
            start++;
            if(!isEVen(start)){
                continue;
            }else{
                count++;
                System.out.println("Even number " + start);
            }
                if(count ==5)
                    break;


        }
        return count;

    }

}

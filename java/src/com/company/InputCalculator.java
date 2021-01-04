package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long average =0;

        while(true){

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){

                sum += scanner.nextInt();
                counter++;
                average = Math.round(sum/counter);
            }else{
                break;
            }
        }

        System.out.println("SUM = "+sum + " AVG = "+ average);
        scanner.close();
    }
}

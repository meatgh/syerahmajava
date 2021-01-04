package com.company;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void minAndMaxInputChallenge(){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Enter the number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int enteredNumber = scanner.nextInt();
//                if(first){
//                    first = false;
//                    min = enteredNumber;
//                    max = enteredNumber;
//                }
                if( enteredNumber < min ){
                    min = enteredNumber;
                }else if(enteredNumber > max  ){
                    max = enteredNumber;
                }
            }else{
                scanner.nextLine();
                break;
            }
        }

        System.out.println("Min = " + min + ", Max = "+ max);

        scanner.close();
    }




}

package com.company;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        boolean isLeap = true;

        if(year < 1 || year > 9999){
            isLeap = false;
        }
        else{

            if(((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0)){
                isLeap = true;
            }else {
                isLeap = false;
            }


        }
        return isLeap;
    }

    public static int getDaysInMonth(int month, int year){

        boolean isLeap = isLeapYear(year);
        int numberOfDays = 0;

        if(month <1 || month > 12 || year <1 || year > 9999){
            return -1;
        }

        switch(month){
            case 1:case 3: case 5: case 7: case 8: case 10: case 12:
                numberOfDays = 31;
                break;
            case 2:
                if(isLeap)
                numberOfDays =29;
                else
                numberOfDays = 28;
                break;

            case 4: case 6: case 9: case 11:
                numberOfDays = 30;
                break;

            default:
                numberOfDays = -1;
                break;
        }

        return numberOfDays;

    }
}

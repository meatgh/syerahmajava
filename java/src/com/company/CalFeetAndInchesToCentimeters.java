package com.company;

public class CalFeetAndInchesToCentimeters {

    public static double calFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <0 || ((inches > 12) || (inches < 0))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }else{

//            int remainderInches = (int) feet%12;
//            int feets = (int)feet/12;
//            double toInches = (feets*12) + remainderInches;
            double centimeters = (inches * 2.54) + ( feet * 12 * 2.54);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cms");
            return centimeters;


        }
    }

    public static double calFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }else{

            double toFeet = (int) inches/12;
            double remainingInches = (int) inches%12;
            System.out.println(inches + "inches equal to " + toFeet + "feet and " + remainingInches);
            double centimeters = calFeetAndInchesToCentimeters(toFeet, remainingInches);
            return centimeters;

        }
    }

}

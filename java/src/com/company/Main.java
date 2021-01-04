package com.company;

import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(HoursMinsSeconds.getDurationString(546));
        System.out.println(HoursMinsSeconds.getDurationString(75,58));
        System.out.println("Area of the circle with the radius 5cm = " + AreaCalculator.area(5));
        System.out.println("Area of the triangle with sides x & y = " + AreaCalculator.area(4, 4));
        System.out.println("The cat is playing ? : " + PlayingCat.isCatPlaying(true, 28));

//        System.out.println("run check ");
//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Minimum Value " + myMinByteValue);
//        System.out.println("Byte Max Value " + myMaxByteValue);
//
//        Short myMinShortValue = Short.MIN_VALUE;
//        Short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Minimum Value " + myMinShortValue);
//        System.out.println("Short Max Value " + myMaxShortValue + "\n");
//
//        Integer myMinIntegerValue = Integer.MIN_VALUE;
//        Integer myMaxIntegerValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value " + myMinIntegerValue);
//        System.out.println("Integer Max Value " + myMaxIntegerValue + "\n");
//
//        Long myMinLongValue = Long.MIN_VALUE;
//        Long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Minimum Value " + myMinLongValue);
//        System.out.println("Long Max Value " + myMaxLongValue + "\n");
//
//        byte aByte = 10;
//        short aShort = 20;
//        int anInt = 50;
//        long aLong = 50000L + 10L *(aByte+aShort+anInt);
//        System.out.println(aLong);

//        float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Float minimum value " + myMinFloatValue);
//        System.out.println("Float max value " + myMaxFloatValue);
//
//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double minimum value " + myMinDoubleValue);
//        System.out.println("Double max value " + myMaxDoubleValue);
//
//        int myIntVAlue = 5/3;
//        float myFloatValue = 5f/3f;
//        double myDoubleValue = 5d/3d;
//
//        System.out.println("myIntValue " + myIntVAlue);
//        System.out.println("myFloatValue " + myFloatValue);
//        System.out.println("myDoubleValue " + myDoubleValue);
//
//        double numberoOfPounds = 200d;
//        double convertedNumber = numberoOfPounds * 0.45359237;
//        System.out.println(convertedNumber);
//
//        System.out.println("Main.main");

//        char myChar = 'D';
//        char myUnicodeChar = '\u00A9';
//        System.out.println(myChar);
//        System.out.println(myUnicodeChar);

//        int result = 1;
//        result += 2;
//        System.out.println(result);
//
//        result -= 1;
//        System.out.println(result);
//        result *=2;
//        System.out.println(result);
//
//        result /= 2;
//        System.out.println(result);

//        double number1 = 20.00d;
//        double number2 = 80.00d;
//        double result = (number1 + number2) * 100.00d;
//        boolean check = result % 40 == 0 ? true : false;
//        if (check == false) {
//            System.out.println("Got some remainder");
//        } else {
//            System.out.println(check);
//        }

//        int highScorePosition = calculateHighScorePosition(900);
//        displayHighScorePosition("Bob", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(400);
//        displayHighScorePosition("Percy", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(50);
//        displayHighScorePosition("Gilbert", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(1000);
//        displayHighScorePosition("Louise", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(500);
//        displayHighScorePosition("Carol", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(100);
//        displayHighScorePosition("Frank", highScorePosition);
//    }
//
//    public static void displayHighScorePosition(String playerName, int highScorePosition) {
//        System.out.println(playerName + " managed to get into position "
//                + highScorePosition + " on the high score table");
//    }
//
//    public static int calculateHighScorePosition(int playerScore){
//        int position = 4;
//
//        if(playerScore >= 1000){
//            position = 1;
//        }else if(playerScore >=500){
//            position = 2;
//        }else if(playerScore >= 100){
//            position = 3;
//        }
//        return position;

        MegaBytesConverter.printMegaBytesAndKiloBytes(-2500);
        CalFeetAndInchesToCentimeters.calFeetAndInchesToCentimeters(0, 13);
        CalFeetAndInchesToCentimeters.calFeetAndInchesToCentimeters(157);

        System.out.println("Trying the switch method " + Switch.switchMethod('A'));
        DayOfTheWeek.dayOfTheWeek(3);
        System.out.println("Is leap year ?: "+NumberOfDaysInMonth.isLeapYear(2020));

        for(int i =2; i <=8; i++){
            System.out.println("10, 000 at " + i + "% interest = " + String.format("%.2f", CalculateInterest.calculateInterest(10000, i)));
        }

        PrimeCheck.primeCheck(10, 50);
        SumOddRange.sumOdd(1, 11);
        System.out.println("Exiting at total number which is " + RangeEvenNumber.evenInRange(1, 20));
        System.out.println("Sum of all the digits in 125 is " +DigitSum.sumOfAllDigits( 3333));
        System.out.println("is the number 121 a palindrome ? : " + Palindrome.isPalindrome(-222));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(2552));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456) + "Even digit sum");
        System.out.println(GCD.getGreatestCommonDivisor(25, 15));
        PrintFactors.printFactors(10);
        System.out.println(PerfectNumber.isPerfectNumber(6));
        NumberToWords.numberToWords(0);
        System.out.println(LargestPrime.getLargestPrime(16));
        System.out.println(" prime check on 217 " + PrimeCheck.isPrime(2  ));
        //MinAndMaxInputChallenge.minAndMaxInputChallenge();
        InputCalculator.inputThenPrintSumAndAverage();





    }
}

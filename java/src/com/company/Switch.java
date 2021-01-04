package com.company;

public class Switch {

    public static char switchMethod(char switchValue) {

        switch (switchValue) {

            case 'A':
                System.out.println("A was found");

            break;
            case 'B':
                System.out.println("B was found");

            break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(switchValue + " was found");

            break;
            default:
                System.out.println("not found");
                break;

        }

        return switchValue;
    }

}

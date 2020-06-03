package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }


    public static String[] strWithLengthLessThanAvg(String[] str) {

    }

    public static String[] strWithLengthGreaterThanAvg(String[] str) {

    }

    private static int averageLengthOfString(String[] str) {

        int countOfStrings = str.length;
        int generalSum = 0;
        for (int i = 0; i < str.length; i++) {
            generalSum = generalSum + str.length;
        }
        return generalSum / countOfStrings;

    }

}

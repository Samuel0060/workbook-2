package com.pluralsight;

import java.util.Arrays;

public class testingStatistics {
    public static void main(String[] args) {
        int testScores[] = {96,45,66,60,34,85,78,89,91,72};
        double average = getAverage(testScores);
        int highScores = highScores(testScores);
        int lowScore = lowScores(testScores);
        double median = middleNumber(testScores);

        System.out.println("Average: "+ average);
        System.out.println("Highest Score is " + highScores);
        System.out.println("Lowest score was " + lowScore);
        System.out.println("The median is " + median);
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        double ave = 0;
        for (double num:arr) {
            sum += num;
            ave = sum/arr.length;

        }
        return ave;

    }

    public static int highScores(int[] arr) {
        Arrays.sort(arr);

        return (arr[9]);
    }

    public static int lowScores(int[] arr) {
        Arrays.sort(arr);

        return (arr[0]);

    }

    public static double middleNumber(int[] arr) {
        Arrays.sort(arr);

        int length = arr.length;

        if (length % 2 == 0){
            int mid1 = arr[(length/2)- 1];
            int mid2 = arr[length/2];
            return (mid2 + mid1) / 2.0;
        }
        else{
            return arr[length/2];
        }
    }
}

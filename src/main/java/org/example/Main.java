package org.example;

public class Main {
    public static long computeTask1(String list) {
        String[] caloricList = list.split("\n");
        long currentSum = 0;
        long biggestSum = 0;

        for (int i = 0; i < caloricList.length; i++) {
            Boolean isBlank = caloricList[i].isBlank();
            Boolean isLast = i == caloricList.length - 1;

            if (!isBlank) {
                currentSum = currentSum + Integer.parseInt(caloricList[i]);
            }
            if (isBlank || isLast) {
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;
                }
                currentSum = 0;
            }
        }
        return biggestSum;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
package org.example;

import java.util.HashMap;

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

    private static HashMap<String, Integer> init() {
        HashMap<String, Integer> resultPossibilies = new HashMap<>();
        resultPossibilies.put("A X", 4);
        resultPossibilies.put("A Y", 8);
        resultPossibilies.put("A Z", 3);
        resultPossibilies.put("B X", 1);
        resultPossibilies.put("B Y", 5);
        resultPossibilies.put("B Z", 9);
        resultPossibilies.put("C X", 7);
        resultPossibilies.put("C Y", 2);
        resultPossibilies.put("C Z", 6);
        return resultPossibilies;
    }

    public static int computeTask2(String list) {
        HashMap<String, Integer> resultPossibilies = init();
        String[] predictlist = list.split("\n");
        int score = 0;
        for (String s : predictlist) {
            if (!s.isBlank()) {
                score = score + resultPossibilies.get(s);
            }
        }
        return score;
    }

    public static int computeTask2_2(String list) {

        HashMap<String,String> newMaptoOld = new HashMap<>();
        newMaptoOld.put("A X","A Z");
        newMaptoOld.put("A Y","A X");
        newMaptoOld.put("A Z","A Y");
        newMaptoOld.put("C X","C Y");
        newMaptoOld.put("C Y","C Z");
        newMaptoOld.put("C Z","C X");

        String[] newFormatList = list.split("\n");
        String oldFormat = "";
        for(String s: newFormatList){
            if (!s.isBlank()) {
                oldFormat = (newMaptoOld.get(s)==null) ? (oldFormat + s + "\n") : (oldFormat + newMaptoOld.get(s) +"\n");
            }
        }
        return computeTask2(oldFormat);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
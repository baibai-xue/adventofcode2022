package org.example;

import java.util.ArrayList;
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

        HashMap<String, String> newMaptoOld = new HashMap<>();
        newMaptoOld.put("A X", "A Z");
        newMaptoOld.put("A Y", "A X");
        newMaptoOld.put("A Z", "A Y");
        newMaptoOld.put("C X", "C Y");
        newMaptoOld.put("C Y", "C Z");
        newMaptoOld.put("C Z", "C X");

        String[] newFormatList = list.split("\n");
        String oldFormat = "";
        for (String s : newFormatList) {
            if (!s.isBlank()) {
                oldFormat = (newMaptoOld.get(s) == null) ? (oldFormat + s + "\n") : (oldFormat + newMaptoOld.get(s) + "\n");
            }
        }

        return computeTask2(oldFormat);
    }

    public static int computeTask3(String input) {
        String[] list = input.split("\n");
        ArrayList <Character> commonElement = new ArrayList<> ();
        //spilt one string into two, find common,and put in list
        for (String value : list) {
            String firstHalf = value.substring(0, value.length() / 2);
            String lastHalf = value.substring(value.length() / 2);
            for (char s : firstHalf.toCharArray()) {
                if (lastHalf.contains(String.valueOf(s))) {
                    commonElement.add(s);
                    break;
                }
            }
        }
        return computePriorities(commonElement);
    }

    public static int computeTask3_2(String input) {
        String[] inputlist = input.split("\n");
        //find common,and put in list
        ArrayList <Character> commonElement = new ArrayList<> ();
        for (int i = 0; i < inputlist.length; i += 3) {
            for (char s : inputlist[i].toCharArray()) {
                if (inputlist[i + 1].contains(String.valueOf(s))) {
                    if (inputlist[i + 2].contains(String.valueOf(s))) {
                        commonElement.add(s);
                        break;
                    }
                }
            }
        }
        return computePriorities(commonElement);
    }

    private static int computePriorities(ArrayList<Character>  charlist) {
        int result = 0;
        for (Object s : charlist) {
            if ((char) s > 96) {
                result += (char) s - 96;
            } else {
                result += (char) s - 38;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i = 'a' + 1;
        int j = 'A' + 1;
        System.out.println(i + "Hello world!" + j);
    }
}
package replits;

import java.util.Scanner;

class NumberOfDuplicates {
    public static int getDup(String[] arr) {
        String result = "";

        for (String each : arr) {
            int count = 0;
            for (String temp : arr) {
                if (each.equals(temp)) {
                    count++;
                }
            }
            if (count == 1) {
                while (!result.contains(each)) {
                    result += each + ",";
                }
            }
        }
        System.out.println(result);
        String[] temResult = result.split(",");
        int answer = arr.length-temResult.length;
        return answer;
    }



    public static void main(String[] args) {

        String[] strs = {"a", "a", "a", "a","d","d","6"};

        System.out.println(getDup(strs));

    }
}
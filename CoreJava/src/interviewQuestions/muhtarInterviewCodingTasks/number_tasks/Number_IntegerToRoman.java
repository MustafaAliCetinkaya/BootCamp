package number_tasks;

import java.util.TreeMap;

public class Number_IntegerToRoman {

    /*
    Write a program that can convert the given integer to roman numeral
        Roman Numerals are:
            I   ========> 1
            IV  ========> 4
            V   ========> 5
            IX  ========> 9
            X   ========> 10
            XL  ========> 40
            L   ========> 50
            XC  ========> 90
            C   ========> 100
            CD  ========> 400
            D   ========> 500
            CM  ========> 900
            M   ========> 1000

            Ex:
                Input: 70
                output: LXX

                Input: 95
                output: XCV

     */

    private static final TreeMap<Integer, String> treemap;

    static {
        treemap =new TreeMap<Integer, String>();
        treemap.put(1000, "M");
        treemap.put(900, "CM");
        treemap.put(500, "D");
        treemap.put(400, "CD");
        treemap.put(100, "C");
        treemap.put(90, "XC");
        treemap.put(50, "L");
        treemap.put(40, "XL");
        treemap.put(10, "X");
        treemap.put(9, "IX");
        treemap.put(5, "V");
        treemap.put(4, "IV");
        treemap.put(1, "I");

    }


    public static final String integerToRoman5(int number) {
        int l = treemap.floorKey(number);
        if (number == l) {
            return treemap.get(number);
        }
        return treemap.get(l) + integerToRoman5(number - l);
    }

}

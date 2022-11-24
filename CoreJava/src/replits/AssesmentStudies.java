package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AssesmentStudies {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.remove(nums.size() - 1);
        nums.add(2);
        nums.add(10);
        nums.add(0, 6);
        nums.remove(1);
        nums.add(-7);
        nums.add(2, 2);
        System.out.println(nums);
        System.out.println("********************************");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 97, 2, 56, 46, 73, 6, 2, 3, 7));
        String s = "";
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 2 || i == 5 || i == 9) {
                continue;
            }
            if (numbers.get(i) == 2 || numbers.get(i) % 3 == 0) {
                s += "1";
            } else {
                s += "0";
            }
        }System.out.println(s);
        System.out.println("********************************");
        ArrayList<String> words = new ArrayList<>(Arrays.asList ("during", "storm","rain","fell","season","cloudy","safe"));
        ArrayList<Integer> lengths = new ArrayList<>();
        for(String word: words) {
            lengths.add(word.length()); }//if we use as word.length-->generate error
        System.out.println(lengths);
        System.out.println("********************************");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums2 = new ArrayList<>();
        int run = in.nextInt();
        while(run > 0) {
            run--;
            switch(in.nextInt()) {
                case 1:
                    nums2.add(1);
                case 5:
                    nums2.add(50);
                    break;
                case 4:
                    break;
                case 8:
                    nums2.remove(0);
                    break;
                case 10:
                case -1:
                case -42:
                    nums2.add(1, 0);
                    break;
                case 55:
                    nums2.add(105);
                    break;
                case 2:
                    nums2.add(20_000);
                    break;
                default:nums2.add(null);
            }
        }
        System.out.print(nums2);
        in.close();
    }
}

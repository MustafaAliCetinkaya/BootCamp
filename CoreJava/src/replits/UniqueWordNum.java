package replits;

public class UniqueWordNum {
    public static void main(String[] args) {
        String[] words = {"java", "C++", "payton", "java", "C++", "payton", "script"};
        int[] numbers = {3, 4, 6, 7, 9, 3, 4, 5, 2, 0, 3, 4, 7, 9};

        for (String each : words) {
            int count = 0;
            for (String temp : words) {
                if (each.equals(temp))
                    count++;
            }
            if (count == 1)
                System.out.println(each);
        }
        System.out.println("*********************************");
        for (int each : numbers) {
            int count = 0;
            for (int temp : numbers) {
                if (each == temp)
                    count++;
            }
            if (count == 1)
                System.out.println(each);
        }
        System.out.println("*********************************");
        for (int i = 0; i < words.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < words.length; j++) {
                if(i!=j&&words[i].equals(words[j])){
                    isUnique=false;
                    break;
                }
            }
            if (isUnique)
                System.out.println(words[i]);
        }
    }
}

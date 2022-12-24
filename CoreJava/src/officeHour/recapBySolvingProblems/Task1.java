package officeHour.recapBySolvingProblems;

public class Task1 {
    public static void main(String[] args) {
        int input=2;
        int count=0;
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j <= input; j++) {
                for (int k = 0; k <= input; k++) {
                    if(i+j+k==input) {
                        System.out.println("" + i + j + k);
                        count++;
                    }
                }
            }

        }
        System.out.println("count = " + count);
    }
}
/*// input a number, use 3 number smaller or equal to that number,
    // make combination that sum of that 3 number is equal to the number you input.
    // 2 --> 6
    /*
002
011
020
101
110
200
     */
// 3 --> 10
// 5 --> 21*/

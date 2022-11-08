package basicsReplit;

import java.util.Scanner;

public class Grade {
    /*
    0-40:FF
    40-50:DD
    50-60:DC
    60-70:CC
    70-80:BB
    80-90:BA
    90-100:AA
    Mid-term exam: %40
    Final exam: %60
    */
    public static void main(String[] args) {

        // Scanner.input en üstte tek seferde tanımlanabilir ve her durum için kullanılabilir.
        System.out.println("Please enter your midterm exam score:");
        Scanner input1 = new Scanner(System.in);
        double mtexam = input1.nextDouble();

        System.out.println("Please enter your final exam score:");
        Scanner input2 = new Scanner(System.in);
        double fexam = input2.nextDouble();
        double ascore = 0.4 * mtexam + 0.6 * fexam;

        System.out.println("Your average  score is : " + ascore);

        // İf yapısındaki sadece küçüktür bölümleri de yeterlidir. Büyük eşitler silinse de düzgün çalışır.

        if (0 <= ascore && ascore < 40) {
            System.out.println("Your letter grade is : FF   \n\"Failed the course but have the right to a make-up examination\"");
        }
        else if (40 <= ascore && ascore < 50) {
            System.out.println("Your letter grade is : DD   \n\"Passed the course but you should make more afford\"");
        }
        else if (50 <= ascore && ascore < 60) {
            System.out.println("Your letter grade is : DC   \n\"Passed the course but not enough\"");
        }
        else if (60 <= ascore && ascore < 70) {
            System.out.println("Your letter grade is : CC   \n\"Passed the course, not bad\"");
        }
        else if (70 <= ascore && ascore < 80) {
            System.out.println("Your letter grade is : BB   \n\"Passed the course, good enough\"");
        }
        else if (80 <= ascore && ascore < 90) {
            System.out.println("Your letter grade is : BA   \n\"Passed the course, very good\"");
        }
        else if (90 <= ascore && ascore <= 100) {
            System.out.println("Your letter grade is : AA   \n\"Passed the course, excellent\"");
        }
        else  {
            System.out.println("You're having a laugh! Please enter your exam scores properly. You can't get these scores! ");
        }


    }
}

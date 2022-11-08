package basicsReplit;

public class Loops5_BreakContinue {
    public static void main(String[] args) {
        int number=0;
        while (true){
           number++;

            if (number%3==0){//CONTINUE atlamak demektir. 3 e bölünen sayıları atlayarak diğerlerini yazdırdı
                continue;
            }

            if (number>100){//101 i yazmaz ve break ile döngüyü KIRAR
                break;
            }



            System.out.println(number);
        }
    }
}

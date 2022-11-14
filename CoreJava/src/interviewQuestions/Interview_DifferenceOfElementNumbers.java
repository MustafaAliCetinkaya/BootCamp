package interviewQuestions;

public class Interview_DifferenceOfElementNumbers {
    public static void main(String[] args) {
        String element="AAABBBBBBBBBBBABAAAAA";
        int a=0;
        int b=0;
        int result=0;

        for (char each:element.toCharArray()){
            if (each=='A'){
                a++;
            }else if(each=='B'){
                b++;
            }
        }

        if (a<b)
            result=b-a;
        else if(a>b)
            result=a-b;

        System.out.println("result = " + result);
    }
}

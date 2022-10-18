package lectureTasks;

public class CountOfChar {
    public static void main(String[] args) {
        String sentence="asdkljasdjhadfkjhafkjhasf";
        int count=0;
        String result="";

        for (int i = 0; i < sentence.length(); i++) {
            char ch=sentence.charAt(i);

            for (int j = 0; j < sentence.length(); j++) {
                char each=sentence.charAt(j);

                if(each==ch)
                    count++;
            } if(result.contains(""+ch)) {
                continue;
            }
            result=result+ch+" = ";
            result+=count+" / ";

        }System.out.println(result);

        }

    }


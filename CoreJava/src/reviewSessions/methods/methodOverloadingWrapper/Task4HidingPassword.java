package reviewSessions.methods.methodOverloadingWrapper;

import java.util.Arrays;

/*Task 4 : Hide Passwords

                    Given an array of passwords (String). Hide each password as a star (*) and show the hidden password

                    Ex:

                    Input:
                    {"one", "hi", "hold}

                    Output:
                    [ ***, **, **** ]*/
public class Task4HidingPassword {
    public static void main(String[] args) {
        String[] str = {"one", "hi", "hold"};
        System.out.println(Arrays.toString(password(str)));
        hidingPassword(str,'*');

    }

    public static String[] password(String[] str) {
        String[] password = new String[str.length];
        int i = 0;
        for (String each : str) {
            int temp = each.length();
            String star = "";
            for (int k = 0; k < temp; k++) {
                star += "*";
            }
            password[i++]= star;

        }
        return password;
    }

    public static void hidingPassword(String[] str2, char element){
        String [] answer=new String[str2.length];
        int i=0;
        for (String each : str2) {
            int index=each.length();
            for (int j = 0; j <= index-1; j++) {
                each=each.replaceAll(each.substring(j,j+1),""+element);

            }
            answer[i++]=each;

        }
        System.out.println(Arrays.toString(answer));
    }
}

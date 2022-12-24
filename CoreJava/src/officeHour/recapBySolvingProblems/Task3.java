package officeHour.recapBySolvingProblems;

public class Task3 {
    public static void main(String[] args) {
        int arr []=new int[10];
        for (int i = 1, j=0;i <=10 ; i++, j++) {
            arr[j]=i;
        }
        int sumOfOdds=0;
        int sumOfEvens=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0)
                sumOfOdds+=arr[i];
            else
                sumOfEvens+=arr[i];
        }
        System.out.println(sumOfOdds);
        System.out.println(sumOfEvens);
    }
}

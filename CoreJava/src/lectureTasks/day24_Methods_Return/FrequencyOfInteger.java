package lectureTasks.day24_Methods_Return;

public class FrequencyOfInteger {
    public static void main(String[] args) {
        int []array={23,2, 45,45,67,5,6,3,2,2,2};
        int element=2;
        int frequency=frequency(array,element);
        System.out.println("Frequency of "+element+" is = "+frequency);

    }
    public static int frequency(int[]array,int element){
        int count=0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }return count;
    }
}

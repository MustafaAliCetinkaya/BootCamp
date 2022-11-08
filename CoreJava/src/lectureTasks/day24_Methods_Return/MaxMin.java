package lectureTasks.day24_Methods_Return;

public class MaxMin {
    public static void main(String[] args) {
        int[]array={12, 23, 45, -56, 7, 678, 345};
        String limitValues=max_min(array);
        System.out.println(limitValues);
    }
    public static String max_min(int [] array){
        int max=array[0];
        int min=array[0];
        String result="";
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }result="Maximum number is "+max+" and minimum number is "+min;
        return result;
    }
}

package lectureTasks.day24_Methods_Return;
/*9. Create a method named contains that passes one integer array and
one integer parameters, the method returns true if the given integer is
contained in the given array, otherwise returns false*/
public class IsContained {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int num = 7;

        System.out.println("Is Contained = " + isContained(arr, num));

    }

    public static boolean isContained(int[] array,int num){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                return true;
            }
        }
        return false;
    }
}

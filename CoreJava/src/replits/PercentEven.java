package replits;

/*Write a method called percentEven that accepts an array of integers as a parameter
and returns the percentage of even numbers in the array as a real number. For example,
if the array stores the elements {6, 2, 9, 11, 3}, then your method should
return 40.0. If the array contains no even elements or no elements at all,
return 0.0.*/
public class PercentEven {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 11, 3};
        System.out.println(percentEven(arr));
    }

    public static double percentEven(int[] list) {
        double percentage = 0;
        int length = list.length;
        if(length!=0){
            for (int i = 0; i < list.length; i++) {
                if (list[i] % 2 == 0) {
                    percentage++;
                }
            }
        }else {
            return 0.0;
        }
        return (100 * percentage) / length;
    }
}

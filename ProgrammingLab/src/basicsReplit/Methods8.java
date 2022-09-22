package basicsReplit;

public class Methods8 {
    public static void main(String[] args) {
        int [] numbers1={12,658,98,74,63,2,5,78,10};
        int [] numbers2={1658,986,749,636,257,108};
        System.out.println("The numbers are arranged in order = " + getArrangedInOrder(numbers1)+"\n");
        System.out.println("The numbers are arranged in order = " + getArrangedInOrder(numbers2));
    }
    public static boolean getArrangedInOrder( int [] numbers){

        boolean arrangedInOrder=true;

        for (int i=0;i<numbers.length-1;i++){
            if(numbers[i]<numbers[i+1]){
                arrangedInOrder=false;
                break;
            }
        }
        return arrangedInOrder;

    }
}

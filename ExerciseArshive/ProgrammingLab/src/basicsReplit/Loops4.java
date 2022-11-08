package basicsReplit;

public class Loops4 {
    public static void main(String[] args) {
        int [] array={12,65,98,87,269,6589};
        int arrayLength=array.length;
        int index=0;
        int sum=0;

        while (index<arrayLength){
            sum+=array[index];//index[0]'dan başlar son elemana kadar gider. Sonuncu sayının indeksi ise length den 1 küçüktür.
            index++;//index lengthe eşit olunca false olur ve çalışmaz.
        }
        System.out.println(sum);
    }
}

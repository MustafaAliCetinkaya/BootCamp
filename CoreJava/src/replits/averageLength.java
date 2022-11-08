package replits;
/*Write a method averageLength of code that computes and returns the average String length of the elements of an array of Strings.
For example, if the array contains {"belt", "hat", "jelly", "bubble gum"}, the average length returned should be 5.5.
Assume that the array has at least one element.*/
public class averageLength {
    public static void main(String[] args) {
        String[] array = {"belt", "hat", "jelly", "bubble gum"};

        double totalLength = 0.0;
        for (int i = 0; i < array.length; i++) {
            totalLength += array[i].length();
        }
        System.out.println((totalLength / array.length));
    }
}

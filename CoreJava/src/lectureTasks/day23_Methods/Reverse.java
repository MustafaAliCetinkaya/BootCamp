package lectureTasks.day23_Methods;

public class Reverse {
    public static void reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println(reversed);
        if(input.equalsIgnoreCase(reversed)){
            System.out.println("This word is palindrome: "+input+" = "+reversed);
        }
    }

    public static void main(String[] args) {

        reverse("I love Java very much!");
        reverse("Methods are reusable. Facilitate the coding.");
        reverse("Anna");
    }
}

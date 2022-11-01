package lectureTasks.day21_Arrays;

/*4. write a program that can count how many palindromes in an array of
        string*/
public class Palindromes {
    public static void main(String[] args) {
        String[] names = {"anna", "level", "adanada", "Java", "Muhtar"};
        int count = 0;
        for (String name : names) {
            String reversedName = "";

            for (int i = name.length() - 1; i >= 0; i--) {
                reversedName += name.charAt(i);
            }

            boolean isPalindrome = name.equalsIgnoreCase(reversedName);
            if (isPalindrome) {
                System.out.println("* \"" + name + "\"" + " is palindrome!");
                count++;
            }
        }
        System.out.println("Number of palindromes: "+count);
    }
}

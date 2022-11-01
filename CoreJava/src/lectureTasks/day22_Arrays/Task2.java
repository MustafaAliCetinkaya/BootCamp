package lectureTasks.day22_Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"}, {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, {"Coke", "Fanta", "Arizona", "Pepsi", "Water"}};

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.println(items[i][j]);
            }
            System.out.println("--------------------------");
        }
        System.out.println("2. part ****************************");
        for (int i = 0; i < items.length; i++) {
            for (int j =items[i].length-1; j>=0; j--) {
                System.out.println(items[i][j]);
            }
            System.out.println("--------------------------");
        }
        System.out.println("3. part *****************************");
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.println(items[i][j]);
            }
            System.out.println("-----------------------");
        }
    }
}

package lectureTasks.day23_Methods;

public class CharactersNumbers {
    public static void main(String[] args) {
        numbers(12,23);//12 / 13 / 14 / 15 / 16 / 17 / 18 / 19 / 20 / 21 / 22 / 23
        characters('A','Z');//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    }

    public static void numbers(int x, int y){
        for(int i=x;i<=y;i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void characters(char x, char y){
        for(char i=x;i<=y;i++ ){
            System.out.print(i+" ");
        }
    }
}

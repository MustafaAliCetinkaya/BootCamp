package lectureTasks.day36_OOP_Inheritence.book;

public class AudioBook extends Book {
    public int length;

    public AudioBook(String title, String type, String author, int price, int length) {
        super(title, type, author, price);
        this.length = length;
    }

    public void listen(){
        System.out.println(title+" is a Audio Book. You can listen it.");
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

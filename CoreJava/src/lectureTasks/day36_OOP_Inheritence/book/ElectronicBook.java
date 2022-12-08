package lectureTasks.day36_OOP_Inheritence.book;

public class ElectronicBook extends Book{
    public String size;
    public int pages;

    public ElectronicBook(String title, String type, String author, int price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public String toString() {
        return "ElectronicBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

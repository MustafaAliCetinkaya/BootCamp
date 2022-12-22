package officeHour.AssigmentPreparation;

public class Book {
    int pages;
    static String author;

    static {
        author = "Stephen King";
    }

    public void set(int pages) {
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.set(500);
        b1.author = "Christopher Paolini";

        Book b2 = new Book();

        System.out.print(b1.author.equals(b2.author) + " ");
        System.out.print(b1.pages == b2.pages);
    }
}

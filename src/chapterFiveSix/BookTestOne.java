package chapterFiveSix;

public class BookTestOne {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBook(10001, "Java编程思想", "null");
        System.out.println(book.toString());
    }
}
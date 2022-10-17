package chapterFiveSix;

public class Book {
    private int id;
    private String name;
    private String author;

    public void setBook(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}

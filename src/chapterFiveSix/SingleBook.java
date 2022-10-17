package chapterFiveSix;

public class SingleBook {
    private static int times = 0;
    private static SingleBook instance;
    private int id;
    private String name;
    private String author;

    private SingleBook(){}

    public synchronized static SingleBook getInstance(int id, String name, String author) {
        times++;
        if (times <= 3) {
            instance = new SingleBook();
            instance.author = author;
            instance.id = id;
            instance.name = name;
        }
        return instance;
    }

    @Override
    public String toString() {
        return "SingleBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

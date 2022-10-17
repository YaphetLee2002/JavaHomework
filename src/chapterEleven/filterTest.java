package chapterEleven;

import java.io.File;

public class FilterTest {

    public static void main(String[] args) {
        File file = new File("C:\\test");
        getAllText(file);

    }

    public static void getAllText(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles((d, name) -> new File(d, name).isDirectory() || name.toLowerCase().endsWith(".txt"));

            for (File f : files) {
                if (f.isDirectory()) {
                    getAllText(f);
                } else {
                    System.out.println(f);
                }
            }
        }
    }
}

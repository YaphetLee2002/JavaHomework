package chapterEleven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        String fileName;
        String fileContainer = null;
        scanner.useDelimiter("\n");

        System.out.println("请输入文件名称：");
        fileName = scanner.next();
        System.out.println("请输入文件内容：");
        if (scanner.hasNext()) {
            fileContainer = scanner.next();
            File file = new File("D:" + File.separator + (fileName.trim() + ".txt"));
            PrintStream out = new PrintStream(new FileOutputStream(file));
            out.print(fileContainer);
            out.close();
        }
    }
}

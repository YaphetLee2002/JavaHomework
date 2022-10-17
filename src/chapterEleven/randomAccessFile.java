package chapterEleven;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class randomAccessFile {
    public static void main(String[] args) throws Exception {
        String path = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the full path of your file: ");
        path = scanner.nextLine();
        File file = new File(path);
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        StringBuffer buffer = new StringBuffer();
        long length = raf.length();
        while (length > 3) {
            length--;
            raf.seek(length);
            int length1 = (char) raf.readByte();
            if (length1 <= 128) {
                buffer.append((char) length1);
            } else {
                length--;
                raf.seek(--length);
                byte[] bytes = new byte[3];
                raf.readFully(bytes);
                buffer.append(new String(bytes));
            }
        }
        System.out.println(buffer);
        raf.close();
    }
}
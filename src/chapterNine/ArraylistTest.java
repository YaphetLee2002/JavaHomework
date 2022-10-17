package chapterNine;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            nameList.add(in.nextLine());
        }
        boolean binFound = nameList.contains("张三");

        if (binFound) {
            System.out.println("该学生在集合中！");
        } else {
            System.out.println("该学生不在集合中！");
        }
        in.close();
    }
}

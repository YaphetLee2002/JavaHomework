package chapterThree;

import java.util.Scanner;

public class compareTwoAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > b) {
            b += 10;
        } else {
            a += 10;
        }
        scan.close();
    }
}
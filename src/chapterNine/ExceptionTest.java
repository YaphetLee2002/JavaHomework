package chapterNine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("输入错误！");
        }
    }
}
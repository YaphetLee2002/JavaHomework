package chapterNine;

import java.util.Scanner;
import java.util.function.Supplier;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

public class SupplierTest {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {

        System.out.println("Enter ten integers.");
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxValue = getMax(() -> {
           int maxNow = MIN_VALUE;
           for (int i : arr) {
               maxNow = Math.max(i, maxNow);
           }
            return maxNow;
        });
        System.out.println("The max value is " + maxValue);
    }
}

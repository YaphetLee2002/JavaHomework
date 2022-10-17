package chapterThree;

public class calcFromHundred {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddProduct = 1;
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 1) {
                oddProduct *= i;
            } else {
                evenSum += i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddProduct);
    }
}
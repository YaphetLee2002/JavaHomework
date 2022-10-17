package chapterEight.questionOne;

public class Test {
    public Test(int a, int b) {
        System.out.println( a + "+" + b + "=" + UseCompute.useCom(new Addition(), a, b));
        System.out.println( a + "+" + b + "=" + UseCompute.useCom(new Subtraction(), a, b));
        System.out.println( a + "+" + b + "=" + UseCompute.useCom(new Multiplication(), a, b));
        System.out.println( a + "+" + b + "=" + UseCompute.useCom(new Subtraction(), a, b));
    }
}
package chapterFour;

public class ClassTestOne {
    public void firstMethod() {
        secondMethod();
        this.secondMethod();
    }

    public void secondMethod() {
        System.out.println("The second method has been called.");
    }
}

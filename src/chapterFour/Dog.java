package chapterFour;

public class Dog {
    public void bark(int x) {
        System.out.println("Barking!");
    }

    public void bark(boolean x) {
        System.out.println("Howling!");
    }

    public void bark(double d) {
        System.out.println("Meowing!");
    }
}

class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(0);
        dog.bark(true);
        dog.bark(0.0);
    }
}
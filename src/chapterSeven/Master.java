package chapterSeven;

public class Master {
    public void feed(Pet pet) {
        pet.eat();
    }
}

class TestMater {
    public static void main(String[] args) {
        Master master = new Master();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();

        master.feed(dog);
        master.feed(cat);
        master.feed(parrot);
    }
}
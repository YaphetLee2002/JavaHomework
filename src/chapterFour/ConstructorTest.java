package chapterFour;

public class ConstructorTest {

    private String name;
    private int age;
    
    public ConstructorTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorTest(int age) {
        this("null", age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}

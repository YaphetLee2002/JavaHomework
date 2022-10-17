package chapterEight.questionTwo;

public class Father {
    private static String name = "张三";

    public static class Child {
        public void introFather() {
            System.out.println(name);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Father.Child child = new Father.Child();
        child.introFather();
    }
}

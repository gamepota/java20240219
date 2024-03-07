package ch06.lecture.p07access.Example;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 같은 객체만 리턴 하도록 코드작성
        return singleton;
    }
}

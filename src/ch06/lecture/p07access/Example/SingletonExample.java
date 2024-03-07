package ch06.lecture.p07access.Example;

public class SingletonExample {
    //    Singleton s1 = new Singleton();
//    Singleton s2 = new Singleton();
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }
}

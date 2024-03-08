package ch07.lecture.p3casting.p12;


public class Example {
    public static void action(A a) {
        a.method1();
        if (a instanceof C c) {
            System.out.println(" 좋았어");
            c.method2();
        }

    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}

package ch16.lecture.p1lambda;

public class C03FunctionalInterface {
}

//@FunctionalInterface
interface C03MyInterface1 {
}

@FunctionalInterface
interface C03MyInterface2 {
    void method1();
}

//@FunctionalInterface
interface C03MyInterface3 {
    void method2();

    void method3();
}

@FunctionalInterface
interface C03MyInterface4 {
    void method1();

    default void method2() {
    }
}

@FunctionalInterface
interface C03MyInterface5 {
    void method1();

    String toString();

    int hashCode();
//  Object class의 public 메소드는 포함하지 않는다 = 추상메소드만 하나면 됨

}
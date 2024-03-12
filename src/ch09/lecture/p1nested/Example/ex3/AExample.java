package ch09.lecture.p1nested.Example.ex3;

public class AExample {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();

    }
}

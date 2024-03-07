package ch07.lecture.p2polymorphism.Example;

public class Child extends Parent {
    @Override
    public void method2() {
        System.out.println("자식 메소드2");
    }

    public void method3() {
        System.out.println("자식 메소드3");
    }
}

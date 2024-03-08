package ch07.lecture.p3casting.Example;

import ch06.lecture.p07access.package1.C;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3;
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}

class Parent {
    public String field1;

    public void method1() {
        System.out.println("부모 1");
    }

    public void method2() {
        System.out.println("부모2");
    }

}

class Child extends Parent {
    public String field2;

    public void method3() {
        System.out.println("아이3");
    }
}
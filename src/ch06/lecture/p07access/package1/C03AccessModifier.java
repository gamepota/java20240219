package ch06.lecture.p07access.package1;

import ch06.lecture.p07access.C01MyClass;

public class C03AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 70;
//        o1.name = "son"; // package private 다른 패키지라 안됨
//        o1.address ="seoul";
    }
}

package ch06.lecture.p07access.package1;

import ch06.lecture.p07access.Example.A2;

public class C2 {
    public C2() {
        A2 a = new A2();

        a.field1 = 1;
//        a.felid2 = 1;
//        a.field3 = 1;

        a.method1();
//        a.method2();
//        a.method3();
    }
}

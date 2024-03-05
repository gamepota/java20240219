package ch06.lecture.p3constructor;

public class C06This {
    public static void main(String[] args) {
        C06MyClass o1 = new C06MyClass("son");
        //o1.name = "son";
        System.out.println(o1.name);

        C06MyClass o2 = new C06MyClass("lee");
        //o2.name = "lee";
        System.out.println(o2.name);
    }
}

class C06MyClass {
    //this: 현재 객체의 참조값, 응용하면 필드와 파라미터를 구분해서 사용가능

    String name;

    C06MyClass(String initialName) {
        this.name = initialName;
    }

}
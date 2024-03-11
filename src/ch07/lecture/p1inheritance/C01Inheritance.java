package ch07.lecture.p1inheritance;

public class C01Inheritance {
    public static void main(String[] args) {
        C01Child child = new C01Child();
//        child.name = "홍길동";
//        System.out.println("이름 " + child.name);
        child.method1();
    }
}

class C01Parent {
    //필드 = 상속은 되지만 대부분 private라 상속 개념은 대부분 메소드에 할당됨
    private String name;

    //메소드
    public void method1() {
        System.out.println("C01Parent.method1");
    }

}


class C01Child extends C01Parent {
// extends: 부모의 멤버를 이 클래스에 상속함
}
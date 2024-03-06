package ch06.lecture.p07access;

public class C01MyClass {
    //access modifier (접근 제한자, 접근 제어자)
    //멤버(필드,메소드)
    //생성자, 클래스
    // p262 그림 참조

    //public : 모든 곳에서 접근 가능(가자 넓은 범위)
    //protected:  상속과 연관 되서 나중에, package private + 상속 받은 다른 패키지
    // (package private, default(키워드로 추가되서 거의 안씀))
    // : 같은 패키지 내에서 접근 가능
    //private: 클래스 내에서만 접근 가능(가장 좁은 범위)

    //public field
    public int age;
    //package private
    String name;

    //private field
    private String address;

    void method1() {
        System.out.println(age);
        System.out.println(address);
    }
}

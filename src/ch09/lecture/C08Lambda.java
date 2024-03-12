package ch09.lecture;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj = () -> System.out.println("재정의1");


    }
}

// 추상메소드가 하나인 인터페이스의
//이명 클래스 객체 생성시 람다 표현식으로
//코드 간단하게 작성 다능하다.
interface C08MyInterface {
    void method();

}
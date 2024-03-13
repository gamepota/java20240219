package ch16.lecture.p1lambda;

public class C02Lambda {
    //람다식(lambda exepression):
    // Functional Interface(추상메소드)가 하나인 인터페이스의
    //익명 클래스의 객체 생성코드를 간단히 한 것
    public static void main(String[] args) {
        C02myInterface obj = (int a, int b) -> {
            System.out.println(a);
            System.out.println(b);
            System.out.println("어쩌구");

        };
    }
}

//@FuncitionalInterface annotation
//: 마크된 이터페이스가 추상 메소드가 하나인지 컴파일러 검사
@FunctionalInterface
interface C02myInterface {
    void method1(int a, int b);
}
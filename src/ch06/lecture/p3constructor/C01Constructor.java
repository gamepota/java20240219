package ch06.lecture.p3constructor;

public class C01Constructor {
    public static void main(String[] args) {
        System.out.println("111111111111");
        // new와 생성자 코드 실행으로 객체 생성
        C01MyClass obj = new C01MyClass();
        System.out.println("222222222222");
    }


}

class C01MyClass {
    //필드

    //생성자:constructor
    // 객체 생성시 실행되는 코드 블럭
    //생성자이름은 클래스 이름과 같다.
    //필요하면 파라미터 작성가능
    C01MyClass() {
        // 객체 생성시 처음 실행되어야 하는 코드들
        // 보통 필드값 초기화
        // 초기설정

        System.out.println("객체 생성시 초기화 코드");
    }

    //메소드
}
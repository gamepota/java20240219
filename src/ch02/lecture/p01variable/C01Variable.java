package ch02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
        // 주석 단축키는 ctrl + /
        // 변수 : variable
        //값을 저장하는 공간의 이름

        // 변수선언: 공간을 만듦
        // 타입명: 변수명

        int a; // int 타입의 저장공간 마련, 공간의 이름은 a
        // 변수에 값 저장 (assignment, 할당, 대입)
        // 변수명 = 값
        a = 10;

        System.out.println(a);
        a = 9;
        System.out.println(a);

        // 변수 b를 int 타입으로 선언하고
        // 변ㅅb에 100을 대입하고
        //변수b 출력

        int b;
        b = 100;
        System.out.println(b);
        //변수명에 사용할 수 있는 문자들
        // 영어 대소문자,숫자,$,_
        //숫자로 시작할 수 없다.
        //_로만 시작할 수 없다
        int c;
        int C;
        int $;
        int c_d;
        int _e;

        // 변수명 작성 관습
        // 소문자로 시작
        //여러 단어의 조합이면 각 단어 앞글자만 대문자
        //lowerCamleCase
        int age;
        int ageOfJames;
        int address;
        int addressOfJane; // 관습o
        int address_of_jane; //관습x

//        int age; // 같은 변수명을 다시 쓸 수 없음

        //자바 키워드는 변수명으로 선언 안됨
//        int package;
//        int void;
//        int int;
//        int float;

    }
}

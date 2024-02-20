package c02.lecture.p02type;

public class C03Integer {
    public static void main(String[] args) {
        // 정수 표현방법 1. 십진법

        int a = 32;
        int b = 23_333_222;

        // 2진법 ( 0,1)
        int c = 0b01001101;
        // 8진법 (0,1,3,4,5,6,7)

        int d = 027123;

        //16진법 ( 0,1,2,3,4,5,6,7,A,B,C,D,E,F) 간간히 씀

        int e = 0x82ace2;
        //서로 진법으로 변역 가능. 기계어 디폴트는2진법이지만 사람이 쓸때 용이하게 다른 진법씀
    }
}

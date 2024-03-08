package ch07.lecture.p3casting;

public class C02Casting {
    public static void main(String[] args) {
        C02Animal animal1 = new C02Tiger();
        C02Tiger tiger1 = (C02Tiger) animal1; //가능
        C02Cat cat1 = (C02Cat) animal1;
        // 컴파일러 오류(compile error) x
        // 실행오류(runtime error) o
        // 이미 animal1 = tiger1인데 거기에 cat1을 강제 변환 할려 해서 cat1 = tiger1이 되서 오류


        System.out.println("프로그램 종료");
    }
}

class C02Animal {
}

class C02Tiger extends C02Animal {

}

class C02Cat extends C02Animal {

}
package ch07.lecture.p4abstract;

public class C02Abstract {
    public static void main(String[] args) {
        C02Animal a1 = new C02fish();
        C02Animal a2 = new C02Cat();
        a2.breathe();
        a1.breathe();

//        C02Animal a3 = new C02bee(); X
    }
}

abstract class C02Animal {
    //abstract method : 몸통 없는 메소드
    //하위 클래스가 꼭 재정의 되야함
    // 추상메소드가 있다면 클래스는 꼭 추상 클래스
    abstract public void breathe();
}

//구현 클래스(concrte class)
class C02fish extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("아가미로 호흡한다.");
    }
}

class C02Cat extends C02Animal {
    @Override
    public void breathe() {
        System.out.println(" 폐호흡");
    }
}
// 자식 클래스가  추상 메소드를 재정의하지 않으면
// 추상클래스가 되어야함
//class C02Bee extends C02Animal {
//
//}
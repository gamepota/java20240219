package ch08.lecture.p1interface;


// 인터페이스는 동시에 여러 클래스에 상속 가능
public class C02Interface {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        C02Tiger tiger = new C02Tiger();
        C02GoldFish goldFish = new C02GoldFish();

        C02Animal animal;
        animal = cat;
        animal = tiger;
        animal = goldFish;

        C02Pet pet;
        pet = cat;
        pet = goldFish;

        C02Aquatic aquatic;
        aquatic = goldFish;
    }
}

// @formatter:off
interface C02Pet { }
interface C02Aquatic { } // 수중생물
class C02Animal { }
class C02Cat extends C02Animal implements C02Pet { }
class C02GoldFish extends C02Animal implements C02Pet, C02Aquatic { }
class C02Tiger extends C02Animal { }

package ch06.lecture.p07access;

public class C02AccessModfier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 50;
        o1.name = "son"; // package private
//        o1.address ="seoul";
    }
}

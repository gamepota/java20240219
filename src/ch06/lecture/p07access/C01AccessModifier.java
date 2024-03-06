package ch06.lecture.p07access;

public class C01AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 30;
        o1.name = "son"; // package private
//        o1.address ="seoul"; X
    }
}

// 하나의 파일에
//하나의 public class 만 작성
class C01My {

}


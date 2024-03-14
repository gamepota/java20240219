package ch12.letcure.p1object.example.ex2;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동일합니다.");
        } else {
            System.out.println("obj2과 obj2는 동일하지 않습니다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3는 동일합니다.");
        } else {
            System.out.println("obj2과 obj3는 동일하지 않습니다.");
        }


    }
}

package ch05.lecture.p2string.Example;

public class EqualsExample {
    public static void main(String[] args) {
        String strvar1 = "홍길동";
        String strvar2 = "홍길동";

        if (strvar1 == strvar2) {
            System.out.println("strvar1과 strvar2는 참조가 같음");
        } else
            System.out.println("strvar1과 strvar2는 참조가 다름");

        if (strvar1.equals(strvar2)) {
            System.out.println("strvar1과 strvar2는 문자열이 같음");
        }

    }
}

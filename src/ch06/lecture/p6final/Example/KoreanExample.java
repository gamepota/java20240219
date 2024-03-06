package ch06.lecture.p6final.Example;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("1243145-1243", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "김자바";
    }
}

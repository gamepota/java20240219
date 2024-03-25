package ch11.lecture.p1exception.Exercise;

public class p04 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

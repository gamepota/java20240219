package ch12.letcure.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a = 3;// auto boxing

        int c = a.intValue();// 옛날 방식 unboxing
        int b = a; // 현재 auto unboxing

        Long d = 5L;

        long e = d;// auto unboxing

        double f = e; // 기본 타입 형변환
        double g = d;// 기본타입의 자동 타입 형변환 적용됨

        Integer h = null;
        int i = h; // auto unboxing 시 오류남, 기본타입은 null 못받음
    }
}

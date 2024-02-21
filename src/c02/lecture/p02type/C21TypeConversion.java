package c02.lecture.p02type;

public class C21TypeConversion {
    public static void main(String[] args) {
        //자동타입 변환 : 작은 크기 -> 큰크기
        // 강제타입 변환(casting) : 큰크기-> 작은 크기

        long a = 234;
        int b = (int) a;// 강제타입 변환 casting
        System.out.println("a = " + a);
        System.out.println("b =" + b);

        short c = 50;
        byte d = (byte) c;

        System.out.println("c =" + c);
        System.out.println("d =" + d);

        short e = 128;
        byte f = (byte) e; // byte의 허용범위를 넘음
        // -128로 출력 되는 아유
        // byte
        // -128 = 1000 0000
        //short
        //128 0000 0000 1000 0000

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        short g = 384;
        byte h = (byte) g;

        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // 강제타입변환 : 실수형 -> 정수형

        double i = 3.14;
        int j = (int) i; // 소수점 이하 탈락, 이처럼 강제 변환시 값이 변하는 걸 감수

        System.out.println("i =" + i);
        System.out.println("j =" + j);


    }
}

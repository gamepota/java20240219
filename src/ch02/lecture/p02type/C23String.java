package ch02.lecture.p02type;

public class C23String {
    public static void main(String[] args) {
        //참조타입
        //기본타입 <-> 참조타입 간의 형변환 안됨

        //기본 타입 <-> String 간의 변한은 메소드 가능

        // 1.String -> 기본 타입
        //p.65 참조 클래스 사용

        String a = "123";
        byte b = Byte.parseByte(a);
        short c = Short.parseShort(a);
        char d; // 얘는 안됨
        int e = Integer.parseInt(a);
        long f = Long.parseLong(a);
        float g = Float.parseFloat(a);
        double h = Double.parseDouble(a);
        // parse: 어떤 문자열을 프로그램에서 쓸수 있도록 데이터를 분해,해석,추출,변환하는 과정을 parsing이라함


        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("e =" + e);
        System.out.println("f =" + f);
        System.out.println("g =" + g);
        System.out.println("h =" + h);

        // String -> 기본타입 파싱 실패
        String i = "가나다";
//        int j = Integer.parseInt(i);

        // 2. 기본타입 -> String 변환

        int k = 356;
        double l = 3.14;

        String m = String.valueOf(k);
        String n = String.valueOf(l);

        System.out.println("k =" + k);
        System.out.println("l =" + l);

        String o = k + ""; // String과 다른 타입간 더하기 연산의 결과는 String임.
        String p = l + "";// 이를 이용해 빈 String과 더해 String으로 변환
        System.out.println("o = " + o);
        System.out.println("p = " + p);

    }

}


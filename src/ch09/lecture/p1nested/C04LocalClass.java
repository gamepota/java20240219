package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {
        final int j = 3;// effectively final
        int k = 2; // 값 변경 하면 local class에서 못씀
        class LocalClass {
            void method1() {
                int i = 0;
                //

                System.out.println(i);

                i = 1;
                //감싸고 있는 메소드의 final 지역변수만 사용가능

                System.out.println(j);
//                j= 5; //감싸진 메소드의 변수를 이용할 수 있지만
//                변경 할 순 없다.
            }
        }
    }
}

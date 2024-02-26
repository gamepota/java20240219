package ch04.lecture.p4for;

public class C03For {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" i = " + i); //  i변수 가능
        }
//        System.out.println("i= " + i);// i 변수 사용불가, for문의 변수 선언은 해당 변수 내에서만 이뤄지기 때문

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("fddf");
        }
        System.out.println("fddf"); // 변수를 따로 선언
    }
}

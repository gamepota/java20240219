package ch03.lecture.p4logical;

public class C05ShortCircuit {
    public static void main(String[] args) {
        int i = 10;

        boolean b1 = (i++) == 10 || (i++) == 30;
        System.out.println("b1 = " + b1);
        System.out.println(" i  = " + i);
        // 앞선 항에서 true임이 밝혀지므로 뒷항의 계산이 진행 되지않음

        i = 10;
        boolean b3 = (i++) == 10 | (i++) == 30;
        System.out.println("b3 = " + b3);
        System.out.println(" i = " + i);
    }
}

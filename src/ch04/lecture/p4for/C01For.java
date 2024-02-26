package ch04.lecture.p4for;

public class C01For {
    public static void main(String[] args) {
        int a = 0;

        while (a < 3) {
            System.out.println(" 어떤 명령문");
            a++;
        }
        // for문이 while문보다 간결하게 쓸 수 있음
        for (int b = 0; b < 3; b++) {
            System.out.println(" 어떤 명령문");
        }
    }

}

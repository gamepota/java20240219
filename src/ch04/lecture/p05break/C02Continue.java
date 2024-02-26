package ch04.lecture.p05break;

public class C02Continue {


    public static void main(String[] args) {
        //continue : 코드블럭 내의 코드 실행을 중단하고
        // 반복문의 () 괄호로 흐름이 넘어감

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}

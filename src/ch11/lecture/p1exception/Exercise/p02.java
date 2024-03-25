package ch11.lecture.p1exception.Exercise;

import java.util.List;

public class p02 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        try {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("list.get(" + i + ") = " + list.get(i));

            }
            return;
//            System.out.println("모두 출력 완료");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("캐치 블럭");
        } finally {
            System.out.println(" 항상 실행 ");
        }
        System.out.println("프로그램 종료.");
    }
}

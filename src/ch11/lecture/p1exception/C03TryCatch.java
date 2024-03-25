package ch11.lecture.p1exception;

import java.util.List;

public class C03TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        String s1 = list.get(0); //exception 발생안함
        try {
            System.out.println("exception 발생 전 실행 코드들");
            //try: excption 발생 할 수 있는 코드를 감싼 블럭
            String s2 = list.get(2);//exception 발생

            System.out.println("exception이 발생 하지 않았으면 ");
            System.out.println("실행되는 코드들 ");

        } catch (IndexOutOfBoundsException e) {
            // catch : 발생한 excepion을 잡고 처리하는 코드 블럭
            System.out.println("exception 발생 후 실행 코드들");
        }
    }
}

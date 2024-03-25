package ch11.lecture.p1exception;

import java.util.List;

public class C01Exception {
    public static void main(String[] args) {
        //Execrption: 예외가 발생했을 대 나오는 객체 타입
        //RuntimeException ; unchecked exception
        //                   컴파일러가 검사안함
        // RuntimeException 외: checked exception
        //                      컴파일러가 검사함

        List<String> list = List.of("css", "html");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
//        System.out.println(list.get(2));
    }
}

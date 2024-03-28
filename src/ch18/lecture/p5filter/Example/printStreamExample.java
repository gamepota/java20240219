package ch18.lecture.p5filter.Example;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class printStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.print("마치 ");
        ps.println("프린터가 출력하는 것처럼 ");
        ps.println("데이터를 출력합니다.");
        ps.printf("| %6d | %-10s | %10s | \n", 1, "홍길동", "도적");
        ps.printf("| %6d | %-10s | %10s | \n", 2, "감자바", "감자");

        ps.flush();
        ps.close();
    }
}

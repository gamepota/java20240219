package ch06.lecture.p5static;

import java.util.Arrays;
//static import: static 클래스명 생략하고  클래스 멤버를 쓸 수 있게 해줌

//import static java.util.Arrays.fill;
//import static  java.util.Arrays.copyOf;

import static java.util.Arrays.*;

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int[] brr = new int[5];

        int[] crr = copyOf(arr, arr.length);


    }
}

package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 추가 add
        set.add("java");
        set.add("spring");
        set.add("html");
        set.add("react");

        //크기 size
        System.out.println(set.size());

        //원소가 없을때만 추가
        boolean b1 = set.add("css"); //o
        boolean b2 = set.add("java");//x

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println(set.size());


    }
}

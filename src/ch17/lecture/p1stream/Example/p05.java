package ch17.lecture.p1stream.Example;

import java.util.Arrays;
import java.util.List;

public class p05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "이것은 입에서 난 소리가 아니여",
                "슉슈슈슈슉 슉슉",
                "워뗘 안보이제."
        );
        list.stream()
                .filter(e -> e.contains("슉"))
                .forEach(System.out::println);

        List<String> list1 = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions");

        list1.stream()
                .filter(s -> s.matches(".*[jJ][aA][vV][aA].*"))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .filter(s -> s.toUpperCase().contains("JAVA"))
                .forEach(System.out::println);
    }
}

package ch17.lecture.p1stream;

import java.util.List;

public class C09Sorted {
    public static void main(String[] args) {
        // soreted: 정렬된 stream을 return
        List<Integer> list = List.of(9, 3, 10, 6, 5, 7, 1, 6, 10);
        list.stream()
                .sorted()
                .forEach(System.out::println);

        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        List<String> list1 = List.of("java", "css", "react", "html", "vue");
        list1.stream()
                .sorted()
                .map(e -> e.length())
                .forEach(System.out::println);

        System.out.println();
        list1.stream()
                .map(e -> e.length())
                .sorted()
                .forEach(System.out::println);

    }
}

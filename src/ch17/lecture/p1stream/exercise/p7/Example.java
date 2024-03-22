package ch17.lecture.p1stream.exercise.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("백제혁", "왕"),
                new Member("천만지", "의류 디자이너"),
                new Member("고구려", "왕")
        );
        List<Member> king = list.stream()
                .filter(m -> m.getJob().equals("왕"))
                .collect(() -> new ArrayList<>(),
                        (c, e) -> c.add(e),
                        (a, b) -> {
                        });

        king.stream()
                .forEach(d -> System.out.println(d.getName()));
    }
}

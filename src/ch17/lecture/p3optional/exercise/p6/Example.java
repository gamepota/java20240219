package ch17.lecture.p3optional.exercise.p6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("시뇽권", 20),
                new Member("감자바", 26)
        );

        double avg = list.stream()
                .mapToInt(m -> m.getAge())
                .average()
                .orElse(0.0);

        System.out.println("avg = " + avg);


    }
}

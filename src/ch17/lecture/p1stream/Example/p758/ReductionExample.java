package ch17.lecture.p1stream.Example.p758;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍", 92),
                new Student("신", 95),
                new Student("감", 88)
        );
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, (d, c) -> d + c);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}

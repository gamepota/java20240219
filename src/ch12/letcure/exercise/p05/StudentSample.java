package ch12.letcure.exercise.p05;

import java.util.HashSet;

public class StudentSample {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 Student 수:" + hashSet.size());
    }
}

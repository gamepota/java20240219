package ch15.lecture.p2set.Example.p673;

import java.util.TreeSet;


public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김자바", 23));
        treeSet.add(new Person("홍박지원", 31));

        for (Person person : treeSet) {
            System.out.println(person.name + ": " + person.age);
        }
    }
}

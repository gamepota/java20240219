package ch07.lecture.p3casting.Example;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

//        if (person instanceof Student) {
//            Student student = (Student) person;
//
//            System.out.println("studentNo : " + student.studentNo);
//            student.study();
//        }

        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }

    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김학생", 10);
        personInfo(p2);
    }
}

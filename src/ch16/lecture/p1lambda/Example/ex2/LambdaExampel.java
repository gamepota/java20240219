package ch16.lecture.p1lambda.Example.ex2;

public class LambdaExampel {
    public static void main(String[] args) {
        Person person = new Person();
        
        person.action(() -> {
            System.out.println("출근");
            System.out.println("프로그래밍을 함");
        });

        person.action(() -> System.out.println("퇴근"));
    }
}

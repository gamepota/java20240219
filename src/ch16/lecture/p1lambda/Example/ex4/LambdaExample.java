package ch16.lecture.p1lambda.Example.ex4;

import static java.lang.Double.sum;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        person.action((x, y) -> (x + y));

        person.action((x, y) -> sum(x, y));
//        person.action(LambdaExample::sum);
    }

}

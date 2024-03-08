package ch07.lecture.p5super.Example;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println(" SmartPhone 생성자 실행");
    }
}

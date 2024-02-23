package ch04.lecture.p1if.sec1;

public class C02Else {
    public static void main(String[] args) {
        //else : if의 ()조건이 faslse일때 실해되는 코드 블럭을 정의

        boolean condition = false;

        if (condition) {
            System.out.println("statement1");
            System.out.println("statement2");
        } else {
            //if의 조건이 false 일때 실행
            System.out.println("statement3");
            System.out.println("statement4");
        }
    }
}

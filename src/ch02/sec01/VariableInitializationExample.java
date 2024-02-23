package ch02.sec01;

public class VariableInitializationExample {
//    public static void main(String[] args) {
//        int value; value에 값이 없어 오류남
//        int result = value + 10;
//        System.out.println(result);

//    컴파일 오류 자바 > 기계어 사이 오류
//    런타임 오류 기계어 . 컴퓨터 사이 오류
////
//    }

    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시간" + minute + "분");

        int totalMinute = (hour * 60) + minute;
        System.out.println("총" + totalMinute + "분");

    }
}

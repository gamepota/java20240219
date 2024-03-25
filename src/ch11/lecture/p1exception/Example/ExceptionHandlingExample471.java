package ch11.lecture.p1exception.Example;

public class ExceptionHandlingExample471 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("배열 인덱스가 초과 됨: " + e.getMessage());

            } catch (Exception e) {
                System.out.println(" 실행에 문제 발생"); // 상위 예외 클래스는 아래에 작성
                //사유: 다형성
            }

        }
    }
}

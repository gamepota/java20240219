package ch11.lecture.p1exception.Example;

public class ExceptionHandlingExample472 {
    public static void main(String[] args) {
        String[] array = {"100", " 1oo", null, "200"};

        try {
            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" 배열 인덱스 초과: " + e.getMessage());
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("데이터의 문제 있음: " + e.getMessage());
        }
    }
}

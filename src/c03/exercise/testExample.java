package c03.exercise;

public class testExample {
    public static void main(String[] args) {
        //문제3

        int pencils = 534;
        int students = 30;

        //학생당 연필갯수

        int pencilsPerStudent = pencils / students;

        System.out.println(pencilsPerStudent);

        int pencilLeft = pencils % students;
        System.out.println(pencilLeft);

        //문제4

        int value = 356;
        System.out.println(value - 56);
        System.out.println(value / 100 * 100);
        System.out.println(value - (value % 100));

        //문제5

        // 사디꼴 넓이 (윗변 +밑변) *높이 /2
        // ( Top+bottom) * height/2.0
        // 작은변위에서 큰범위로 가니까 강제 변환 x

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 = (lengthTop + lengthBottom) * height / 2.0;
        double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2;
        double area3 = (double) (lengthTop + lengthBottom) * height / 2;
        double area4; // 계산을 끝내고 더블로 변한해서 오류
        System.out.println(area1);


    }


}

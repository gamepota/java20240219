package ch03.exercise;

public class p107num27 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score > 90)) ? "가" : "나";
        System.out.println(result);

        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;
        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result1 = z + 10;
            System.out.println("resul1t =" + result1);
        }
    }
}

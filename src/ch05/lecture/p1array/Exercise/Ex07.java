package ch05.lecture.p1array.Exercise;

public class Ex07 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 5, 3, 8, 2};

        for (int i1 = 0, i2 = 4; i1 < 5 && i2 >= 0; i1++, i2--) {
            if (arr[i1] * arr[i2] >= 40) {
                System.out.println(arr[i2]);
                break;
            }

        }

    }
}

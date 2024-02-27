package ch05.lecture.p1array;

public class C10Array {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[]{6, 4, 2};// 배열의 길이와 각 원소가 정의 됨

        int[] arr2 = {9, 3, 1, 0};// 배열의 길이와 각 원소가 정의

        // 배열의 길이만 정의하기
        //각 타입 별로 다른 초기값을 가짐 p173 표 참조
        int[] arr3;
        arr3 = new int[3];//배열의 길이가 3

        int[] arr4 = new int[4];// 배열의 길이가 4
        var arr5 = new int[7];// 배열의 길이가 7

        //
        int[] arr6 = new int[2];
        arr6[0] = 11;
        arr6[1] = 23;
    }
}

package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {
        // 04. 참조 타입 (배열 복사  에제).png

        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));
        //이 경우에는 arr1,arr2가 동일한 번지수를 공유하게 됨.
        // 하지만 유틸 사용시 같은 값을 같는 다른 번지를 만드는듯?

        int[] arr3 = {5, 4};
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        System.out.println(System.identityHashCode(arr3));
        System.out.println(System.identityHashCode(arr4));

    }
}

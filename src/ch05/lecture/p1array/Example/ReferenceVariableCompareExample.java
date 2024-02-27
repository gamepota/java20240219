package ch05.lecture.p1array.Example;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;

        System.out.println(arr1 == arr2); // 다를듯
        System.out.println(arr2 == arr3);// 같을듯

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));
        System.out.println(System.identityHashCode(arr3));
    }
}

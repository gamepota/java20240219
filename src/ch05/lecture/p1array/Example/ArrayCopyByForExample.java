package ch05.lecture.p1array.Example;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};

        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
    }
}

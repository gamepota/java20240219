package ch05.lecture.p1array.Example;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] arr1 = {"java", "array", "copy"};

        String[] arr2 = new String[5];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
    }
}

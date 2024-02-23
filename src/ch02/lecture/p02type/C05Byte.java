package ch02.lecture.p02type;

public class C05Byte {
    public static void main(String[] args) {
        // byte
        // 최소값: -128
        //최대값: 127

        // 1byte 의 저장 공간으로 값 표현(저장)
        // 1byte = 8bit
        //bit = 0 또는 1

        byte a = 23;
        byte b = 127;
//        byte c = 128; x
        byte d = -128;
//        byte e = -129; x

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
//        byte var6 = 128; 범위 밖

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }

}

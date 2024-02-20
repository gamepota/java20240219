package c02.lecture.p02type;

public class C18Scope {

    public static void main(String[] args) {
        // 변수는 선언된 블럭 안에서만 사용 가능

        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        } // v2는 블럭 안에서 선언되서 선언된 블럭 안에서만 사용가능.
//        int v3 = v1 + v2 =5;
    }
}

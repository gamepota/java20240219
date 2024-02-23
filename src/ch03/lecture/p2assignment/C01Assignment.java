package ch03.lecture.p2assignment;

public class C01Assignment {
    public static void main(String[] args) {
        // assignmment operator (할당 연산자, 대입연산자)
        // 기호 : =
        // 오른쪽 값을 왼쪽에 대입(할당, assign)
        //연산순서는 오른쪽부터

        int a = 3;
        int b = 5;
        int c = b;
        int d = c = 7;

        int e = c = b + 1 + a * d;
        //연사자의 우선순위 책 105p 참조 외울필요는 없음
        // 연산에 있어서 ()가 순서 가 가장 높음
        // 그냥 사칙연산이라 생각해

    }
}

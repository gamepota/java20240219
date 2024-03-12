package ch09.lecture.p2anonymous.C07;

public class C07Sample {
    public static void main(String[] args) {
        //
        Game rpsGame = new Game();
        rpsGame.field.play();


        Game lottoGame = new Game();
        // 초보자: 1~45 값 중 한개 출력
        // 중급자: 1~45 값 중 6개 중복없이 출력
        lottoGame.method1();
    }
}


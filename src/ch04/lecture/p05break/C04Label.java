package ch04.lecture.p05break;

public class C04Label {
    public static void main(String[] args) {
        // label: 반복문에 label을 붙여서 break를 종료시킬 수 있다.
        // 잘 안씀.
        loop1:
        // 라벨이름 아무거나 가능
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(STR."(\{i}, \{j}");

                if (j == 5) {
                    break loop1;
                    // break 가장 가까운 반복문 종료
                    //label 사용시 label이 붙은 반복문 종료
                }
            }
        }
    }
}

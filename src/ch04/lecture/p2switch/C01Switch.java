package ch04.lecture.p2switch;

public class C01Switch {
    public static void main(String[] args) {

        String city = "제주";

        //값이 서울일때
        switch (city) {
            case "서울":
                System.out.println("statement 2");
                break;
            //값이 제주
            case "제주":
                System.out.println("statement 3");
                break;

            case "부산":
                System.out.println("statement 4");
                break;

            case "대전":
                System.out.println("statement 5");
                break;
            case "대구":
                System.out.println("statement 6");
                break;
            case "전주":
                System.out.println("statement 7");
                break;
            case "경주":
                System.out.println("statement 8");
                break;
            case "개성":
                System.out.println("statement 9");
                break;
        }


    }
}

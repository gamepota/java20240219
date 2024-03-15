package ch12.letcure.p3regex.example;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{3,4}";
        String data = "010-123-4567";

        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }

        String id = "5Angel1004";
        String regExp1 = "[a-zA-z]{1}\\w{7,11}";
        boolean isMatch = Pattern.matches(regExp1, id);
        if (isMatch) {
            System.out.println("가능");
        } else {
            System.out.println("불가능");
        }

        id = "Angle12";

        regExp1 = "[a-zA-z]{1}\\w{7,11}";
        isMatch = Pattern.matches(regExp1, id);
        if (isMatch) {
            System.out.println("가능");
        } else {
            System.out.println("불가능");
        }

    }
}

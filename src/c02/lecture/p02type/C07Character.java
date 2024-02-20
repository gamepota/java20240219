package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        //char (character)
        //2btye == 16bits 이하로 문자를 표현
        // 0~ 65535
        // unicode 사용

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = -333;
//        char e = 65536;
        char f = 12610;
        char g = 8258;
        char h = '⁂';
        char i = '가';
        int o = 0x1f607;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis =" + emojis);

        int p = 0x1f3a4;
        char[] emoji2 = Character.toChars(p);
        String emojit = new String(emoji2);
        System.out.println("emojit =" + emojit);
        // 필요할때 유니코드 차트에서 찾으시오.

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("f=" + f);
        System.out.println("g=" + g);
        System.out.println("h=" + h);

    }
}

package c02.sec2;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        char c3 = '가';
        char c4 = 44032;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        int c5 = 0x1f680;
        char[] emoji1 = Character.toChars(c5);
        String emojis = new String(emoji1);
        System.out.println("emojis =" + emojis);

    }
}

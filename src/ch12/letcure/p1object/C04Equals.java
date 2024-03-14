package ch12.letcure.p1object;

public class C04Equals {
    public static void main(String[] args) {
        C04Book book1 = new C04Book("자바");
        C04Book book2 = new C04Book("나는 자바다");
        C04Book book3 = book2;
        C04Book book4 = new C04Book("나는 자바다");

        System.out.println(book4.equals(book1));//false
        System.out.println(book4.equals(book2));//false -> true
        System.out.println(book3.equals(book2));//true
    }
}

class C04Book {
    private String title;

    public C04Book(String title) {
        this.title = title;
    }

    //equals


    @Override
    public boolean equals(Object obj) {
        C04Book other = (C04Book) obj;
        return this.title.equals(other.title);
        // 참조값이 다르더라도 같게 취급하겠다.
    }
}
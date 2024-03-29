package ch15.lecture.p2set;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class C06Comparator {
    public static void main(String[] args) {
        var set = new TreeSet<C06Book>(C06Comparator::compare);
        set.add(new C06Book("이게 자바지", 30000));
        set.add(new C06Book("모두 깃", 25000));
        set.add(new C06Book("react", 35000));

        System.out.println(set);
    }

    private static int compare(C06Book a, C06Book b) {
        return a.getTitle().compareTo(b.getTitle());
    }
}

class C06Book {
    private String title;
    private Integer price;

    @Override
    public String toString() {
        return "C06Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        C06Book c06Book = (C06Book) o;

        if (!Objects.equals(title, c06Book.title)) return false;
        return Objects.equals(price, c06Book.price);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public C06Book(String title, Integer price) {
        this.title = title;
        this.price = price;
    }
}
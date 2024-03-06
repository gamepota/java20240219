package ch06.lecture.p07access;

public class C03Encapsulation {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass();
//        obj1.name = "son";
        obj1.setName("son");
//
        obj1.setAge(44);

//        System.out.println(obj1.name);
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}

class C03MyClass {
    private String name;

    private int age;
    private boolean married;

    //getter
    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    } // get -> is

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
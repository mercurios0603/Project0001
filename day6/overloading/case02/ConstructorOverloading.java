package day6.overloading.case02;

public class ConstructorOverloading {

    public static void main(String[] args) {
        Person p1 = new Person(20, "홍길동");
        p1.introduce();

        Person p2 = new Person();

        p2.age = 30;
        p2.name = "이순신";
        p2.introduce();

        Person p3 = new Person(22);

        p3.name = "유관순";
        p3.introduce();

    }
}

class Person {

    int age ;
    String name;

    Person () {
    }

    Person (int age) {
        this.age = age;
    }

    Person (int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("나는 %d살 %s입니다.\n", age, name);
    }
}
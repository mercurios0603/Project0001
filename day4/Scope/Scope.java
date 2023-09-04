package day4.Scope;
public class Scope {
    public static void main(String[] args) {
        System.out.println(Person.avgAge); // 클래스 변수 출력

        //JAVA에서는 클래스의 메서드를 객체화 없이 직접 호출할 수 없다.
        //메서드를 호출하려면 해당 메서드가 속한 클래스의 인스턴스를 먼저 생성해야 한다.
        //객체화 없이 메서드를 호출하는 것은 기본적으로 Java의 객체 지향 프로그래밍 원칙에 어긋난다.
        //그러나 static을 사용하여 정적 메서드(static method)를 만들면 객체화 없이 메서드를 호출 가능하다.

        //System.out.println(Person.age); // 객체를 만들지 않았기 때문
        Person person = new Person(); // Person 클래스의 인스턴스 생성
        System.out.println(person.age); // 인스턴스 변수 출력

        Person.hi(); // 안녕
    }
}

class Person {
    static int avgAge = 100; // 클래스 변수
    int age = 30; // 인스턴스 변수

    public static void hi() {
        System.out.println("안녕");
    }
}


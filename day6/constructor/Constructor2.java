package day6.constructor;

public class Constructor2 {

    public static void main(String[] args) {

        // 1. 편해짐
        // 2. 코드가 줄어듦
        // 3. 초기화 안할 수가 없음.

        Person p1 = new Person(20, "홍길동", new Car());
        p1.drive();
        p1.introduce();


    }
}

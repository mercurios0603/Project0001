package day6.overloading.case03;

public class DefaultConstructor {
    public static void main(String[] args) {
        Person p1 = new Person(); // 매개변수가 없는 생성자 -> 디폴트 생성자
    }
}

class Person {
    int age;

    // 디폴트 생성자는 자바가 자동으로 만들어준다. (없는 게 아니다!)
    // 단, 개발자가 직접 생성자를 하나라도 만들면 디폴트 생성자는 자동 생성되지 않는다.
    // 눈에 보이지 않는
    // Person() {
    // } 가 존재한다고 보면 된다.
}

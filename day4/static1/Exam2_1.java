package day4.static1;

public class Exam2_1 {
    // 객체화 없이 설계도에 있는 능력을 바로 사용해주세요.
    // 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.
    public static void main(String[] args) {

        Car.drive();
    }
}

class Car {

    static String status = "코드 적상작동중";
    public static void drive() {
        System.out.printf(status);
    }
}

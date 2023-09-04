package day4;

public class Exam1_1 {
    public static void main(String[] args) {
        // 문제 : 자동차가 3번 달리게 해주세요.
        // 출력 : 자동차가 달립니다.

        Vehicle car1 = new Vehicle();
        car1.name = "1번차";

        Vehicle car2 = new Vehicle();
        car2.name = "2번차";

        Vehicle car3 = new Vehicle();
        car3.name = "3번차";

        //v1. 1개의 자동차가 3번 달리게 해주세요.

        car1.starting();
        car1.starting();
        car1.starting();


        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        car1.starting();
        car2.starting();
        car3.starting();

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
    }
}

class Vehicle {
    String name;

    public void starting() {
        System.out.printf("%s가 달립니다.\n", name);
    }
}

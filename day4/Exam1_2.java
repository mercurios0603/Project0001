package day4;

public class Exam1_2 {

    // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
    // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
    // 각 자동차가 자신의 최고속력으로 달리게 해주세요.
    public static void main(String[] args) {

        Vehicle2 car1 = new Vehicle2();
        car1.name = "1번자동차";
        car1.maxvelocity = 220;

        Vehicle2 car2 = new Vehicle2();
        car2.name = "2번자동차";
        car2.maxvelocity = 250;

        car1.starting();
        car2.starting();

        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.

    }
}

class Vehicle2 {
    String name;
    int maxvelocity;

    public void starting() {
        System.out.printf("%s가 최대속력 %d km로 달립니다.\n", name,maxvelocity);
    }
}

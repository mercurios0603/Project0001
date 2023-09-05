package day5;

public class Exam1_3 {// 메인 함수
    public static void main(String[] args) {
        // 메인함수가 시작되면 a자동차 라는 변수가 stack 영역에 만들어진다.
        자동차2 a자동차;

        // new 자동차2()의 인스턴스가 heap 영역에 만들어 지며 변수 a자동차에 저장된다.
        a자동차 = new 자동차2();

        // a자동차라는 자동차2()의 인스턴스가 자동차()2의 클래스의 메서드인 달리다()를 실행시킨다.
        a자동차.달리다();
    }
}

// class => 설계도, 틀(객체를 만들기 위한)
class 자동차2 {
    // 달리다 함수/메서드
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}

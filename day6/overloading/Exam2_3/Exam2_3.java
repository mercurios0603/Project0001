package day6.overloading.Exam2_3;

// 문제 - 상황에 따라서 디폴트 생성자와 직접구현 생성자 중 1개를 이용해주세요.

public class Exam2_3 {
    public static void main(String[] args) {
        new 사과();
        new 포도();
        new 사람("홍길동");
        new 사람();
    }
}

class 사과 {
    // 이렇게 생성자를 만들지 않은 클래스는 자바에서 자동으로 생성자를 하나 만들어준다.
    // 참고로 자동으로 만들어 질 때 `매개변수 없는 생성자`가 만들어집니다.
}

class 포도 {
    포도() {
        // 이렇게 생성자를 직접 만들면 자바는 더 이상 자동으로 생성자를 만들어주지 않습니다.
    }
}

class 사람 {
    사람() {

    }
    사람(String name) {

    }
}
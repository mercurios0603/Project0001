package day5.casting;

public class Exam4_2 {

    // 문제 - 전사가 가지고 있는 변수 a무기가 칼과 활에 모두 호환되게 해주세요.
    public static void main(String[] args) {
        // a전사의 타입을 전사 클래스로 선언하고 전사 클래스의 인스턴스를 a전사에 넣는다.
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        System.out.println(a전사.나이);
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;


    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }

    void 공격() {
        a무기.공격();
    }
    void 스킬사용() {
        a무기.스킬사용();
    }
}


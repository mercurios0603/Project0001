package day5.casting;

public class Exam4_3 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "홍길동";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 홍길동이/가 칼로 공격합니다.
    }
}

package day5.inheritance;

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
*/
public class Exam2_3 {
        public static void main(String[] args) {
            오리 a오리 = new 오리();
            a오리.날다();
            // 출력 : 오리가 날개로 날아갑니다.

            청둥오리 a청둥오리 = new 청둥오리();
            a청둥오리.날다();
            // 출력 : 오리가 날개로 날아갑니다.

            흰오리 a흰오리 = new 흰오리();
            a흰오리.날다();
            // 출력 : 오리가 날개로 날아갑니다.
        }
}

package day2;

public class Condition {
    public static void main(String[] args) {
        // 조건문

        // 실행이 될 수도 있고 안될 수도 있는

        System.out.println("창문 닫기");

        // 비가 올 때만 창문을 닫기 -> 조건문 내부의 true와 false에 따라 창문 닫기2의 출력여부 결정
        // 아래 구문에서는 isRain이 변수로 사용

        boolean isRain = true;

        if(isRain) {
            System.out.println("창문 닫기2");
        }

            // 야식

            int cost = 10500;

            // 소지금이 20000원 이상일 때
        if (cost >= 20000) {
                System.out.println("치킨");
        }

            // 소지금이 20000원 미만일 때
        if (cost < 20000) {
                System.out.println("포카칩");
        }

    }
}

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

        int cost = 1000;

            // 소지금이 20000원 이상일 때
        if (cost >= 20000) {
                System.out.println("치킨");
            // 소지금이 20000원 미만일 때, 2000원 이상일 때
        } else if (cost >= 2000) {
            System.out.println("포카칩");
        } else {
            System.out.println("구매불가");
        }

        //할인대상 -> 19세 미만, 60세 이상일 경우 할인 대상

        int age = 25;

        if (age < 19) {
            System.out.println("미성년자 할인대상");
        } else if (age >= 60) {
            System.out.println("고령자 할인대상");
        } else {
            System.out.println("표준요금 부과");
        }

        // 논리연산자


        // 곱연산(and) - &&, 모두 참이면 참, 그외 거짓
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && true);

        // 합연산(or) - ||, 모두 거짓이면 거짓, 그외 참 (하나만 만족, 하나만 참이면 참)
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || true);

        int age2 = 25;
        int cost2 = 15000;

        if (cost2 < 20000 && cost2 >= 2000) {
            System.out.println("포카칩");
        }

        if (age2 <=19 || age2 >= 60) {
            System.out.println("할인대상(할인유형은 데스크에 문의하세요)");
        } else {
            System.out.println("표준요금 부과");
        }


    }
}

package day2;

public class ConditionEX {
    public static void main(String[] args) {
        // 조건문 -> 택일구조

        // 양자택일 (이지선다)
        // 남녀, 할인대상, 홀짝
        boolean isMale = true;

        if (isMale) {
            System.out.println("남자");
        } else { //위에서 결정되면 아래는 자연스럽게 결정되는 이지선다 - 양자택일. else로 구현.
            System.out.println("여자");
        }

        // 삼자택일(삼지선다)
        // 초중고, 직좌우,

        int age3 = 15;
        if (age3 >= 8 && age3 <= 13) {
            System.out.println("초등학교"); // 8~13
        } else if (age3 <= 16) {
            System.out.println("중학교"); // 14~16
        } else if (age3 <= 19) {
            System.out.println("고등학교"); // 17~19
        }

        // 오자택일(오지선다)
        // 대학성적(A,B,C,D,E)
        // 90~100 A, 80~89 B, 70~79 C, 60~69, D, 50~59 E

        int score = 49;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else if (score >= 50) {
            System.out.println("E");
        } else {
            System.out.println("재수강 필요");
        }
    }
}

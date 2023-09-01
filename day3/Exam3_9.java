package day3;

public class Exam3_9 {

    public static boolean isNegative(int a) { // boolean에 대응하는 값이 true, false 인 것이다.
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // 0은 양수로 보겠습니다.
        int no = 0;

        if(isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.
    }
}

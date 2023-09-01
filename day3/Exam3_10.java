package day3;

public class Exam3_10 {
    // 1 부터 n까지 수 중 짝수인 것만 출력.

    public static boolean isEven(int num) {
        if (num % 2 == 0) {  // 나머지가 0이면 짝수, 나머지가 0이 아니면 홀수
            return true;
        } else {
            return false;
        }
    }

    public static void printEven(int n) {
        for (int i = 0 ; i < n ; i++) {
            if (isEven(i+1)) {
                System.out.println(i+1);
            }
        }
        // isEven 메서드를 이용.
    }
    public static void main(String[] args) {

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4

    }
}

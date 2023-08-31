package day2;

public class Exam13 {
    public static void main(String[] args) {

    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */

        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (int i = n; i <= m ; i++) {
            if (i % 2 != 0) {  // 나머지가 0이면 짝수, 나머지가 0이 아니면 홀수
                System.out.println("=== " + i + " 홀수단 중 짝수곱 ===");
                for(int j = 1 ; j <= limit ; j++) {
                    if (j % 2 == 0) { // 나머지가 0이면 짝수, 나머지가 0이 아니면 홀수
                        System.out.println(i + "*" + j + "=" + i*j );
                    }
                }
            }
        }
    }
}

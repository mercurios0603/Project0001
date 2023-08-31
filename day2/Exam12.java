package day2;

public class Exam12 {

    // 문제 : 구구단 작성
    // 조건 : 짝수번째만 곱하기
    /* 출력예시 :

    2 * 2 = 4
    2 * 4 = 8
    2 * 6 = 12
    2 * 8 = 16

    ...
      9단까지 이런식으로 나오면 됩니다.
    */
    public static void main(String[] args) {
        for (int i = 2 ; i < 10 ; i++) {
            System.out.println("=== " + i + "단 짝수번째 ===");
            for(int j = 1 ; j < 5 ; j++) {
            System.out.println(i + "*" + 2*j + "=" + 2*i*j );
            }
        }
    }
}

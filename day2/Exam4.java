package day2;

public class Exam4 {
    public static void main(String[] args) {
        // 홀수와 짝수를 구별해주세요.
        // num이 짝수면 even, 홀수면 odd 출력해주세요.
        // 짝수 판별 : 2로 나누어서 떨어지면 짝수
        int num = 6;
        int result = num % 2; // 나머지가 0이면 짝수, 나머지가 0이 아니면 홀수
        if (result == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }
}

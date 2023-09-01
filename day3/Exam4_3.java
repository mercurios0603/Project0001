package day3;

public class Exam4_3 {
    public static void main(String[] args) {
        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.

        int arr[] = {3, 6, 9, 12, 15};

        for (int i = 4; i >= 0; i--){ // for 구문의 내림차순 문법, 배열의 시작은 0임을 기억하라.
            System.out.println(arr[i]);
        }
    }
}

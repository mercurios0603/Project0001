package day8.input;

// Scanner를 이용해 입력값을 받아
// 구구단을 원하는 단이 나오게 해주세요.

//예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

// 4단 출력.

import java.util.Scanner;

public class Exam3_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dan = scan.nextInt();
        int result;

        for (int i = 2; i < 10; i++) {
            result = dan * i;
            System.out.println(dan + "X" + i + "=" + result);
        }
    }
}

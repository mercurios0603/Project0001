package day8.input;

import java.util.Scanner;

//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45
public class Exam3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        System.out.println("당신이 입력한 1번 값은 : " + num1);

        int num2 = scan.nextInt();
        System.out.println("당신이 입력한 2번 값은 : " + num2);

        int sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + sum);

    }
}

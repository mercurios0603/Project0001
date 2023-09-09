package day8.Exception;

import java.util.Scanner;
import java.util.InputMismatchException;

// 올바른 나이를 입력할 때까지 계속 물어보기.
// 나이는 0보다 커야 하며, 문자값이 들어가면 안된다.
// 0이하의 값이 들어가면 0보다 커야합니다 출력하고 다시 입력요구
// 숫자가 아닌 문자가 들어가면 숫자를 입력해주세요 출력하고 다시 입력요구
// 올바른 숫자가 입력되면 입력된 숫자를 출력해주고 종료.

public class ExceptionExam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        while (true) {
            try {
                System.out.print("나이를 입력해주세요 : ");
                age = scan.nextInt();

                // 나이가 1보다 작으면 예외 발생
                if (age < 1) {
                    System.out.println("1 이상의 정수를 입력해주세요.");
                }
                // 올바른 나이가 입력되면 반복문 종료
                break;
            } catch (InputMismatchException e) {
                // 정수가 아닌 값을 입력하면 예외 발생
                System.out.println("1이상의 정수가 아닙니다.");
                scan.nextLine(); // 입력 버퍼 비우기
            }
        }
        System.out.println("입력된 나이: " + age);
    }
}
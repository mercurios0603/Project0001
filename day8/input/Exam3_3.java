package day8.input;

import java.util.Scanner;

// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
public class Exam3_3 {
    public static void main(String[] args) {

        // 입력버퍼를 주의하라.
        // 예를 들어 23, kimyonggu를 입력하면
        // 버퍼에 23 | ln | kimyonggu | ln 이 쌓인다. (ln은 엔터 줄바꿈)
        // 아래의 프로그램에서 숫자는 온전하게 읽어온다. nextInt가 숫자는 잘 읽어옴
        // netLine은 ln 줄바꿈이 나오면 스캔이 끝나는건데 숫자 직후에 바로 줄바꿈 ln이 있음.
        // 그래서 끝나는거임. -> 이를 해결하기 위한 것에 아래 버퍼 비우기용 코드임!

        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력해주세요:");
        int age = scan.nextInt();

        scan.nextLine(); // 버퍼 비우기용

        System.out.print("이름을 입력해주세요:");
        String name = scan.nextLine();

        System.out.printf("안녕하세요 %d세 %s입니다.", age, name);

        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.

    }
}
